package com.example.eventdashboard.repository;

import com.example.eventdashboard.model.Event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDepartment(String department);
}
