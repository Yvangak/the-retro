package com.theretro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/the-retro/v1/retrospective")
public class HappyController {

    @GetMapping("/feelings")
    public ResponseEntity<String> getFeelings(){
        return new ResponseEntity<String>("Hello buddy", HttpStatus.OK);
    }
}
