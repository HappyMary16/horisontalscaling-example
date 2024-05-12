package org.example.client;

import org.example.api.model.Cat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "catClient", url = "${api-service.client.cats.url}/cats")
public interface CatClient {

    @GetMapping
    List<Cat> getCats();

    @GetMapping("/{catName}")
    Cat getCat(@PathVariable("catName") String catName);

    @PostMapping
    Cat saveCat(@RequestBody Cat cat);
}
