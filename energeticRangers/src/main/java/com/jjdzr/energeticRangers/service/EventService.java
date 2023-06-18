package com.jjdzr.energeticRangers.service;

import com.jjdzr.energeticRangers.entity.Event;
import com.jjdzr.energeticRangers.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void save (Event event){

        eventRepository.save(event);

    }

    public List<Event> getAllEvent(String keyword) {
        if (keyword != null){
        return eventRepository.findAll(keyword);
        }
        return eventRepository.findAll();
    }

    public Event getEventById(int id)
        {
            return eventRepository.findById(id).get();
        }



        public void deleteById(int id)
        {
            eventRepository.deleteById(id);
        }
}
