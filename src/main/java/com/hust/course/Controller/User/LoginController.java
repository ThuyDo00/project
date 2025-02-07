package com.hust.course.Controller.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class LoginController {


    @GetMapping("/login")
    public String login(Model model){
        return "user/home/login";
    }
}
