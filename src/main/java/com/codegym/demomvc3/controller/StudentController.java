package com.codegym.demomvc3.controller;

import com.codegym.demomvc3.model.Student;
import com.codegym.demomvc3.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")

public class StudentController {
    @Autowired
    private IService<Student> studentIService;

    @GetMapping("/")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Student> list = studentIService.findAll();
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @GetMapping("/hello")
    public ModelAndView showHello() {
    ModelAndView model = new ModelAndView("hello");
    model.addObject("name","hello");
    return model;
    }


}
