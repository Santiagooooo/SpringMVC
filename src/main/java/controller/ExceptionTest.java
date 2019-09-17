package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionTest {

    @RequestMapping("/test1")
    public String test1(){
        int i = 5/0;
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(){
        String s = null;
        s.toString();
        return "success";
    }
}
