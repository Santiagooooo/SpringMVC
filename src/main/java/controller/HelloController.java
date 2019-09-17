package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String name = httpServletRequest.getParameter("name");

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "hello " + name);
        mav.setViewName("hello");
        return mav;
    }
}
