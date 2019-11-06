package com.example.feignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("Server-Client")
public interface UserService {
    @GetMapping("/info")
     String info();

    @GetMapping("/user/{id}")
     User get(@PathVariable("id") Long id);

    @GetMapping("/user")
    public List<User> get();

    @PostMapping("user")
    public void add(@RequestBody User user);

    @PutMapping("user")
     void update(@RequestBody User user);

    @DeleteMapping("user/{id}")
     void delete(@PathVariable("id") Long id);
}
