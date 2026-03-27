package com.example.eventdashboard.model;

import jakarta.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String department;
    private String title;
    private String description;
    private String date;
    private String venue;
    private String registrationLink;
    private String posterUrl;

    public Event() {
    }

    public Event(String department, String title, String description, String date,
                 String venue, String registrationLink, String posterUrl) {
        this.department = department;
        this.title = title;
        this.description = description;
        this.date = date;
        this.venue = venue;
        this.registrationLink = registrationLink;
        this.posterUrl = posterUrl;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public String getRegistrationLink() {
        return registrationLink;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setRegistrationLink(String registrationLink) {
        this.registrationLink = registrationLink;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
