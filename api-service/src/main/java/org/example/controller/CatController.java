package org.example.controller;

import org.example.client.CatClient;
import org.example.api.model.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RequestMapping("/cats")
@RestController
public class CatController {

    private final CatClient catClient;

    public CatController(CatClient catClient) {
        this.catClient = catClient;
    }

    @GetMapping
    public Collection<Cat> getAllCats() {
        return catClient.getCats();
    }

    @GetMapping("/{catName}")
    public Cat getCat(@PathVariable String catName) {
        if (catClient.getCat(catName) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return catClient.getCat(catName);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Cat createCat(@RequestBody Cat cat) {
        try {
            catClient.getCat(cat.getName());
        } catch (Exception e) {
            return catClient.saveCat(cat);
        }
//        if () {
//            return catClient.getCat(cat.getName());
//        } else {
//            throw new ResponseStatusException(HttpStatus.CONFLICT);
//        }

        return null;
    }
}