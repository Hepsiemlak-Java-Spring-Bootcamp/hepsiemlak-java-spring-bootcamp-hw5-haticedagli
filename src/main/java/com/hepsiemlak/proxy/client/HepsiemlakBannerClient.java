package com.hepsiemlak.proxy.client;

import com.hepsiemlak.proxy.model.Banner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "hepsiemlakBannerClient", url = "http://localhost:8081")
public interface HepsiemlakBannerClient {

    @RequestMapping(method = RequestMethod.POST, value = "/banners")
    ResponseEntity<Banner> saveBanner(@RequestBody Banner banner);

    @RequestMapping(method = RequestMethod.GET, value = "/banners")
    ResponseEntity<List<Banner>> getBanners();

}
