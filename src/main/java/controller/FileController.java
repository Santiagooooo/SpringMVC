package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.UploadUtils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/uploads")
    public String upload(String username, @RequestParam CommonsMultipartFile[] files, HttpSession session) {
        System.out.println("用户名：" + username);

        //获取上传目录的物理路径
        String path = session.getServletContext().getRealPath("/WEB-INF/upload/");
        String path2 = ("D:\\javaworkplace\\springMVC\\src\\main\\webapp\\WEB-INF\\upload");
        System.out.println("path：" + path);
        for(CommonsMultipartFile file: files){
            String fileName = file.getOriginalFilename();
            System.out.print("文件原名：" + fileName);
            String uuidName = UploadUtils.getUUIDName(file.getOriginalFilename());
            System.out.println("，重命名后的名字：" + uuidName);
            File filepath = new File(path, fileName);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            try {
                file.transferTo(new File(path, uuidName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }

    @RequestMapping("/download")
    public void download(String filename, HttpSession session, HttpServletResponse resp){
        String path = session.getServletContext().getRealPath("/WEB-INF/upload/");
        File file = new File(path, filename);

        try {
            filename = "movie-山楂树之恋.png";
            filename = new String(filename.getBytes("utf-8"), "iso8859-1");
            resp.setHeader("content-disposition", "attachment;filename=" + filename);
            StreamUtils.copy(new FileInputStream(file), resp.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/{filename}/download2")
    public void download2(@PathVariable String filename, HttpSession session, HttpServletResponse resp){
        String path = session.getServletContext().getRealPath("/WEB-INF/upload/");
        File file = new File(path, filename);

        try {
            filename = "movie-山楂树之恋.png";
            filename = new String(filename.getBytes("utf-8"), "iso8859-1");
            resp.setHeader("content-disposition", "attachment;filename=" + filename);
            StreamUtils.copy(new FileInputStream(file), resp.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/download3")
    public ResponseEntity<byte[]> download2(String filename, HttpSession session) throws IOException {
        String path = session.getServletContext().getRealPath("/WEBINF/upload/");
        File file=new File(path,filename);
        //ResponseEntity<byte[]>需要三个参数：文件数据、响应头、状态码
        //文件数据
        byte[] bytes = FileUtils.readFileToByteArray(file);
        //响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("contentdisposition","attachment;filename="+filename);
        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.OK);

    }
}
