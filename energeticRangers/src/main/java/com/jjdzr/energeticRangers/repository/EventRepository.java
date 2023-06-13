package com.jjdzr.energeticRangers.repository;

import com.jjdzr.energeticRangers.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {

    @Query("SELECT p FROM Event p WHERE p.typeOfEvent LIKE %?1%")
    public List<Event> findAll (String keyword);


    }




