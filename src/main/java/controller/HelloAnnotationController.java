package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAnnotationController {

    @RequestMapping("/hello")
    public ModelAndView sayHello(String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "你好 " + name);
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/hello2")
    public ModelAndView sayHi(String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "您好 " + name);
        mav.setViewName("hello");
        return mav;
    }
}
