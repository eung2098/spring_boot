package response.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import response.dto.User;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody // Response -> body 값 제공
    @GetMapping("user")
    public User user(){
        var user = new User();
        user.setName("eung");
        user.setAddress("충주");
        return user;
    }

}
