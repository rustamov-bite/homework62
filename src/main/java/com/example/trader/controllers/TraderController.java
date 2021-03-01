package com.example.trader.controllers;

import com.example.trader.entities.Trader;
import com.example.trader.services.TraderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traders")
@AllArgsConstructor
public class TraderController {
    private final TraderService traderService;

    @PostMapping("/trader")
    public ResponseEntity<Void> addUser() {
        String name = "Miko";
        traderService.saveTrader(name);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/trader")
    public Trader getUser() {
        return traderService.getTrader();
    }
}
