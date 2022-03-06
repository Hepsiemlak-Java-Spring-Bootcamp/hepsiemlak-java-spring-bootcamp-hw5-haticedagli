package com.hepsiemlak.proxy.client;

import com.hepsiemlak.proxy.model.Advert;
import com.hepsiemlak.proxy.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "hepsiemlakClient", url = "http://localhost:8080")
public interface HepsiemlakClient {

    @RequestMapping(method = RequestMethod.POST, value = "/adverts")
    ResponseEntity<Advert> saveAdvert(@RequestBody Advert advert);

    @RequestMapping(method = RequestMethod.GET, value = "/adverts")
    ResponseEntity<List<Advert>> getAdverts();

    @RequestMapping(method = RequestMethod.GET, value = "/adverts/{advertId}", produces = "application/json")
    ResponseEntity<Advert> getAdvertById(@PathVariable("advertId") Integer advertId);

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    ResponseEntity<User> saveUser(@RequestBody User banner);

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    ResponseEntity<List<User>> getUsers();

}
