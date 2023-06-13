package com.jjdzr.energeticRangers.service;

import com.jjdzr.energeticRangers.entity.MyEventsList;
import com.jjdzr.energeticRangers.repository.MyEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEventsListService {

    @Autowired
    private MyEventsRepository myEvents;
    public void saveMyEvents(MyEventsList event)
    {
        myEvents.save(event);
    }

    public List<MyEventsList> getAllMyEvents(){
        return myEvents.findAll();
    }

    public void deleteById (int id)
    {
        myEvents.deleteById(id);
    }



}
