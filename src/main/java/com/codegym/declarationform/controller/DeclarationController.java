package com.codegym.declarationform.controller;

import com.codegym.declarationform.model.Declaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarationController {
    @GetMapping("")
    public String showForm(Model model){
        Declaration declaration = new Declaration();
        model.addAttribute("declaration", declaration);
        return "home";

    }
    @PostMapping("/declare")
    public String showDeclaration(Declaration declaration, Model model){
        model.addAttribute("declaration", declaration);
        return "home";
    }
}
