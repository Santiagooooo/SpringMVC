package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import vo.UserVo;

@Controller
@RequestMapping("/session")
@SessionAttributes("userVo")
public class SessionController {

    @RequestMapping("/step1")
    public String step1(UserVo userVo){
        System.out.println("step1.userVo: " + userVo);
        return "step1";
    }

    @RequestMapping("/step2")
    public String step2(UserVo userVo){
        System.out.println("step2.userVo: " + userVo);
        return "step2";
    }

    @RequestMapping("/step3")
    public String step3(UserVo userVo){
        System.out.println("step3.userVo: " + userVo);
        return "step3";
    }

    @RequestMapping("/register")
    public String register(UserVo userVo){
        System.out.println("register.userVo: " + userVo);
        return "success";
    }
}
