package com.jjdzr.energeticRangers.repository;

import com.jjdzr.energeticRangers.entity.MyEventsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEventsRepository extends JpaRepository<MyEventsList, Integer> {
}
