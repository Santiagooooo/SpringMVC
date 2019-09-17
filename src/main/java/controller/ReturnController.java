package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnController {

    @RequestMapping("showLogin2")
    public String showLogin2(){
        System.out.println("ReturnController.showLogin2");
        return "login";
    }

    @RequestMapping("login2")
    public String Login(String username, String password, Model model){
        if("admin".equals(username) && "123".equals(password)){
            model.addAttribute("username", username);
            return "success";
        }else{
            model.addAttribute("loginError", "username or password  error");
//            return "login";
            return "forward:showLogin2";//表示转发
        }
    }

    //void返回值，将请求的url即/test1作为视图名，等价于返回值类型为String时，return "test1";
    @RequestMapping("/test1")
    public void test1(){
        System.out.println("returnController.test1");
    }
}
