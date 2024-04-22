package com.codegym.demomvc3.controller;

import com.codegym.demomvc3.model.Student;
import com.codegym.demomvc3.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/search")
    public ModelAndView searchStudent(@RequestParam String nameSearch) {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView showFormAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        Student student = new Student();
        modelAndView.addObject("student",student);
        return modelAndView;
    }
    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        this.studentIService.add(student);
        return "redirect:/students/";
    }

    @GetMapping("/hello")
    public ModelAndView showHello() {
    ModelAndView model = new ModelAndView("hello");
    model.addObject("name","hello");
    return model;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editStudent(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        return modelAndView;
    }

}
