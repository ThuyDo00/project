package com.hust.course.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class EventController {
    @GetMapping("/event")
    public String evetn(){
        return "user/home/event";
    }
}
