package controller;

import editor.AddressEditor;
import entity.Address;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.UserVo;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String register(UserVo userVo, Errors error){
//    public String register(@Valid UserVo userVo, Errors error){
        //手动进行服务端数据校验
        //if(userVo.getAge() < 0 || userVo.getAge() > 120){
        //    error.reject("年龄只能在0-120之间");//手动添加错误
        //}
        //判断是否有错误
        if(error.hasErrors()){
            System.out.println(error);
            return "register";
        }
        System.out.println("UserController.register.userVo:" + userVo);
        return "success";
    }

    @ModelAttribute("types")
    public List<String> getTypes(){
        System.out.println("UserController.getTypes");
        List<String> list = Arrays.asList("辅助","上单","中单","打野","下路");
        return list;
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("UserController.test");
        return "result";
    }

//    @InitBinder
//    public void initBinder(DataBinder binder){
//        binder.registerCustomEditor(Address.class, new AddressEditor());
//    }
}
