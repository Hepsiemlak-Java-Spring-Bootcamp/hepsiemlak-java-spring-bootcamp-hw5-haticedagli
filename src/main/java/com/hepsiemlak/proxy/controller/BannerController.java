package com.hepsiemlak.proxy.controller;

import com.hepsiemlak.proxy.client.HepsiemlakBannerClient;
import com.hepsiemlak.proxy.model.Banner;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banners")
@RequiredArgsConstructor
public class BannerController {

    private final HepsiemlakBannerClient hepsiemlakBannerClient;

    @GetMapping
    public ResponseEntity<List<Banner>> getAllBanners() {
        return hepsiemlakBannerClient.getBanners();
    }

    @PostMapping
    public ResponseEntity<Banner> saveBanner(@RequestBody Banner request) {
        return hepsiemlakBannerClient.saveBanner(request);
    }
}
