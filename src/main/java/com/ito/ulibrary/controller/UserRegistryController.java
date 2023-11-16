package com.ito.ulibrary.controller;

import com.ito.ulibrary.service.UserService;
import com.ito.ulibrary.user.dto.UserRegistryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserRegistryController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegistryDTO returnNewRegistryDTO() {
        return new UserRegistryDTO();
    }
    @GetMapping("/register")
    public String showRegistryForm() {
        return "register";
    }
    @GetMapping("/login")
    public String userlogin() {
        return "login";
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistryDTO userRegisterDTO) {
       userService.save(userRegisterDTO);
       return "redirect:/register?success";
    }
}
