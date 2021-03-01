package com.example.trader.controllers;

import com.example.trader.entities.Day;
import com.example.trader.services.DayService;
import com.example.trader.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/days")
@AllArgsConstructor
public class DayController {
    private final DayService dayService;
    private final EventService eventService;

    @PostMapping("/day")
    public ResponseEntity<Void> saveDay() {
        dayService.deleteDays();
        for (int i = 1; i < 31; i++) {
            int a = new Random().nextInt(eventService.getEvents().size());
            Day day = Day.builder()
                    .day(i)
                    .eventId(eventService.getEvents().get(a).getId())
                    .build();
            dayService.saveDay(day);
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/day")
    public List<Day> getDays() {
        return dayService.getDays();
    }
}
