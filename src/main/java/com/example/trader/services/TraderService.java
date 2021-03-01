package com.example.trader.services;

import com.example.trader.entities.Trader;
import com.example.trader.repositories.TraderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class TraderService {
    private final TraderRepo traderRepo;

    public void saveTrader(String name) {
        Random random = new Random();
        Trader trader = Trader.builder()
                .name(name)
                .money(random.nextInt(20) + 1)
                .build();
        traderRepo.save(trader);
    }

    public Trader getTrader() {
        return traderRepo.findAll().get(0);
    }
}
