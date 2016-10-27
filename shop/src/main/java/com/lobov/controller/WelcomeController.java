package com.lobov.controller;

import com.lobov.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by alex1_000 on 28.10.2016.
 */
@Controller
public class WelcomeController {
    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String welcome(/*@RequestParam("name")String name,*/ Model model){
        model.addAttribute("products",productService.findAll());
        return "welcome";
    }
}
