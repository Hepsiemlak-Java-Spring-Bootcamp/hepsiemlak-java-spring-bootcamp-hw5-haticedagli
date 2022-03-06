package com.hepsiemlak.proxy.controller;

import com.hepsiemlak.proxy.client.HepsiemlakClient;
import com.hepsiemlak.proxy.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final HepsiemlakClient hepsiemlakClient;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return hepsiemlakClient.getUsers();
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User request) {
        return hepsiemlakClient.saveUser(request);
    }
}
