package controller;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Map;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws IOException {
        System.out.println("ParamController.test1," + req + "," + resp + "," + session);

        String username = req.getParameter("username");
        session.setAttribute("username", username);

        InputStream is = req.getInputStream();
        OutputStream os = resp.getOutputStream();
        Reader reader = req.getReader();
        Writer writer = resp.getWriter();

        PrintWriter out = resp.getWriter();
        out.print("<h1>" + username + "<h1>");
        out.flush();
        out.close();
    }

    @RequestMapping("/test2")
    public void test2(InputStream is, OutputStream os) throws IOException {
        System.out.println("ParamController.test2," + "," + is + "," + os);
    }

    @RequestMapping("/test3")
    public void test3(Reader reader, Writer writer) throws IOException {
        System.out.println("ParamController.test2," + "," + reader + "," + writer);
    }

    @RequestMapping("/test4")
    public String test4(Model model, Map map, ModelMap modelMap){
        model.addAttribute("name", "wql");
        map.put("age", 23);
        modelMap.addAttribute("sex", "male");
        modelMap.put("address", "beijing");
        return "result";
    }

    @RequestMapping("/test5")
    public String test5(String name,
                        @RequestParam(name = "date")int age,
                        @RequestParam(required = false, defaultValue = "1") Integer sex,
                        String address){
        System.out.println("name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address);
        return "result";
    }

    @RequestMapping("/test6/{name}/{age}")
    public String test6(@PathVariable("name") String stuName,
                        int age,
                        @RequestParam(required = false, defaultValue = "1") Integer sex,
                        String address){
        System.out.println("name=" + stuName + ", age=" + age + ", sex=" + sex + ", address=" + address);
        return "result";
    }

    @RequestMapping("/test7")
    public String test7(@RequestHeader("User-Agent") String userAgent, @RequestHeader("Cookie") String cookie){
        System.out.println("userAgent: " + userAgent + "\nCookie:" + cookie);
        return "result";
    }

    @RequestMapping("/addCookie")
    public String addCookie(HttpServletResponse resp){

        //向客户端添加cookie
        Cookie cookie = new Cookie("username", "wql");
        cookie.setMaxAge(7*24*60*60);//7天
        resp.addCookie(cookie);

        return "result";
    }

    @RequestMapping("/test8")
    public String test8(@CookieValue String username, @CookieValue("JSESSIONID") String sessionId){
        System.out.println("username: " + username + "\nsessionId:" + sessionId);
        return "result";
    }

    @RequestMapping("/test9")
    public String test9(@RequestBody String requestBody){
        System.out.println("requestBody:" + requestBody);
        return "result";
    }
}
