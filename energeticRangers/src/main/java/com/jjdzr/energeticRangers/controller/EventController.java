package com.jjdzr.energeticRangers.controller;


import com.jjdzr.energeticRangers.entity.Event;
import com.jjdzr.energeticRangers.entity.MyEventsList;
import com.jjdzr.energeticRangers.service.EventService;
import com.jjdzr.energeticRangers.service.MyEventsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventController {

    @Autowired
    private EventService service;

    @Autowired
    private MyEventsListService myEventService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/event_register")
    public String eventRegister() {
        return "eventRegister";
    }

    @RequestMapping("/available_events")
    public String getAllEvents(Model model) {
        List<Event> list = service.getAllEvent();
        model.addAttribute("event", list);
        return "eventsList";

    }

    @PostMapping("/save")
    public String addEvent(@ModelAttribute Event event) {
        service.save(event);
        return "redirect:/available_events";
    }

    @GetMapping("/my_events")
    public String getMyEvents(Model model) {
        List<MyEventsList> myEventsList = myEventService.getAllMyEvents();
        model.addAttribute("eventList", myEventsList);
        return "myEventsList";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Event event = service.getEventById(id);
        MyEventsList myEventsList = new MyEventsList(
                event.getId(),
                event.getNumberOfTickets(),
                event.getNameOfEvent(),
                event.getPrice(),
                event.getImgUrl(),
                event.getTypeOfEvent(),
                event.getCity(),
                event.getTypeOfEvent(),
                event.getDescriptionShort(),
                event.getDescriptionLong(),
                event.getDayOfEvent(),
                event.getMonthOfEvent(),
                event.getYearOfEvent());
        myEventService.saveMyEvents(myEventsList);
        return "redirect:/my_events";
    }

    @RequestMapping("/editEvent/{id}")
    public String editEvent(@PathVariable("id") int id, Model model) {
        Event event = service.getEventById(id);
        model.addAttribute("event", event);

        return "eventEdit";
    }

    @RequestMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/available_events";
    }


}
