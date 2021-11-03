package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
                         @RequestParam(value="name", defaultValue = "John Smith") String name,
                         @RequestParam(value="number", defaultValue = "0") int number) {

        model.addAttribute("doctorname", name);
        model.addAttribute("doctornumber", number);

        return "doctor";
    }
}
