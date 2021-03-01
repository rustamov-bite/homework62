package com.example.trader.services;

import com.example.trader.entities.Day;
import com.example.trader.repositories.DayRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DayService {
    private final DayRepo dayRepo;

    public void saveDay(Day day) {
        dayRepo.save(day);
    }

    public List<Day> getDays() {
        return dayRepo.findAll();
    }

    public void deleteDays() {
        dayRepo.deleteAll();;
    }
}
