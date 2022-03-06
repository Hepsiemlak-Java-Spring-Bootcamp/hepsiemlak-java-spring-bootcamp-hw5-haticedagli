package com.hepsiemlak.proxy.controller;

import com.hepsiemlak.proxy.client.HepsiemlakClient;
import com.hepsiemlak.proxy.model.Advert;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adverts")
@RequiredArgsConstructor
public class AdvertController {

    private final HepsiemlakClient hepsiemlakClient;

    @GetMapping
    public ResponseEntity<List<Advert>> getAllAdvert() {
        return hepsiemlakClient.getAdverts();
    }

    @PostMapping
    public ResponseEntity<Advert> createAdvert(@RequestBody Advert request) {
        return hepsiemlakClient.saveAdvert(request);
    }

    @GetMapping(value = "/{advertNo}")
    public ResponseEntity<Advert> getAdvertByAdvertId(@PathVariable(required = false) int advertNo) {
        return hepsiemlakClient.getAdvertById(advertNo);
    }

}
