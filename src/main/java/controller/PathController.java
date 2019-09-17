package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/path")
public class PathController {

    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("PathController.showLogin");
        return "login";
    }

    @RequestMapping("/forwardLogin")
    public String forwardLogin(){
        System.out.println("PathController.forwardLogin");
        return "forward:showLogin";
//        return "forward:/showLogin";
    }

    @RequestMapping("/test1/*")
    public String test1(){
        return "hello";
    }

    @RequestMapping("/test2/{id}/{name}")
    public String test2(@PathVariable int id, @PathVariable("name") String username){
        System.out.println("PathController.test2.id: " + id + ", name: " + username);
        return "hello";
    }

    @RequestMapping(value = {"/test3", "test4"})
    public String test3(){
        return "hello";
    }

//    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        System.out.println("PathController.deleteUser, id: " + id);
        return "hello";
    }

//    @RequestMapping(path = "/user/{id}", method = RequestMethod.POST)
    @PostMapping("/user/{id}")
    public String selectUser(@PathVariable Integer id){
        System.out.println("PathController.selectUser, id: " + id);
        return "hello";
    }

    @RequestMapping(path = "/test4", params = {"id", "username=admin", "password!=123"})
    public String test4(){
        return "hello";
    }

    @RequestMapping(path = "/test5", headers = {"Cookies","Accept-Language=zh-CN,zh;q=0.9,en;q=0.8"})
    public String test5(){
        return "hello";
    }
}
