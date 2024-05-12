package org.example.client;

import org.example.api.model.Statistic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(name = "statisticClient", url = "${api-service.client.statistics.url}")
public interface StatisticClient {

    @GetMapping("/statistics")
    Collection<Statistic> getAllStatistics();

    @GetMapping("/statistics/{catsCafeName}")
    Statistic getCat(@PathVariable("catsCafeName") String catsCafeName);
}
