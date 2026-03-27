package com.example.eventdashboard.controller;

import com.example.eventdashboard.model.Event;
import com.example.eventdashboard.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:5500")
public class EventController {

    @Autowired
    private EventService eventService;

    // Location to save uploaded files
    private static final String UPLOAD_DIR = "uploads/";

    // Get events by department
    @GetMapping("/{dept}")
public List<Event> getEvents(@PathVariable String dept) {
    return eventService.getEventsByDepartment(dept.trim());
}

    

    // Get all events
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    // Add event with file upload for poster
    @PostMapping
    public Event addEvent(@RequestParam("department") String department,
                          @RequestParam("title") String title,
                          @RequestParam("description") String description,
                          @RequestParam("date") String date,
                          @RequestParam("venue") String venue,
                          @RequestParam("link") String link,
                          @RequestParam("poster") MultipartFile poster) throws IOException {

        // Save the poster image
        String posterFilename = savePosterImage(poster);

        // Create Event object
        String fullPosterUrl = "http://localhost:8080/uploads/" + posterFilename;
Event event = new Event(department, title, description, date, venue, link, fullPosterUrl);
 

        // Save event
        return eventService.addEvent(event);
    }

    // Method to save poster image
    private String savePosterImage(MultipartFile poster) throws IOException {
        if (poster.isEmpty()) {
            throw new IOException("Failed to store empty file");
        }

        // Get the original file name
        String originalFilename = StringUtils.cleanPath(poster.getOriginalFilename());

        // Define the path where to save the image
        Path path = Paths.get(UPLOAD_DIR + originalFilename);

        // Ensure the upload directory exists
        Files.createDirectories(path.getParent());

        // Save the file to the specified path
        Files.copy(poster.getInputStream(), path);

        return originalFilename;
    }

    // Delete event
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }
}
