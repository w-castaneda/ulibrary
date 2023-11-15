package com.ito.ulibrary.controller;

import com.ito.ulibrary.service.UserService;
import com.ito.ulibrary.user.dto.UserRegistryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserRegistryController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegistryDTO returnNewRegistryDTO() {
        return new UserRegistryDTO();
    }

    @GetMapping
    public String showRegistryForm() {
        return "registry";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistryDTO userRegisterDTO) {
       userService.save(userRegisterDTO);
       return "redirect:/registry";
    }
}
