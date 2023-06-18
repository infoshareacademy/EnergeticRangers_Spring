package com.jjdzr.energeticRangers.controller;

import com.jjdzr.energeticRangers.repository.UserRepository;
import com.jjdzr.energeticRangers.service.MyEventsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyEventsListController {

    @Autowired
    private MyEventsListService myEventsListService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id)
    {
        myEventsListService.deleteById(id);
        return "redirect:/my_events";
    }



}
