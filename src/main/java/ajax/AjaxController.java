package ajax;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping("/test1")
    public void test1(HttpServletResponse response) throws IOException {
        response.getWriter().write("success");
    }

    @RequestMapping("/test2")
    @ResponseBody //将返回值写到返回体中，并不是跳转视图
    public String test2(){
        return "success2";
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public User showUser(){
        User user = new User("wql", 20);
        return user;
    }
}
