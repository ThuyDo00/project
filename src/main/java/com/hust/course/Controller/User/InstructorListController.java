package com.hust.course.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class InstructorListController {
    @GetMapping("/instructor")
    public String Instructor(){
        return "user/home/instructor";
    }
}
