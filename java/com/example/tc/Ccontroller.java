package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Ccontroller {
    @Autowired
    CourseServiceimpl courseService;
    @RequestMapping("")
    public String answer(Model model){
        List<Course> courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "index";
    }
    @PostMapping("/addstu")
    public String addstu(@RequestParam("cno") String cno, @RequestParam("cname") String cname, @RequestParam("sname") String sname, @RequestParam("snumber") String snumber, Model model){
        courseService.addStu(new Course(cno, cname, sname, snumber));
        List<Course> courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "index";
    }
}
