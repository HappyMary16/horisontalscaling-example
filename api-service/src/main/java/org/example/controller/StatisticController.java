package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.model.Statistic;
import org.example.client.StatisticClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RequestMapping("/statistics")
@RestController
public class StatisticController {

    private final StatisticClient statisticClient;

    @GetMapping
    public Collection<Statistic> getAllStatistics() {
        return statisticClient.getAllStatistics();
    }

}