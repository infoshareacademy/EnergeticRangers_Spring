package com.jjdzr.energeticRangers.controller;

import com.jjdzr.energeticRangers.service.UserService;
import com.jjdzr.energeticRangers.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/registration")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }
/*    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }*/
    @GetMapping
    public String showRegistrationForm (Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        return "userRegister";
    }
    @PostMapping
    public String registerUserAccount (@ModelAttribute("user")UserRegistrationDto userRegistrationDto) {
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }
}
