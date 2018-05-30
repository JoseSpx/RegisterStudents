package com.josesp.students_register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showList(){
        return "list";
    }

}
