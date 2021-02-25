package com.example.board.controller;

import com.example.board.entity.RandomNumber;
import com.example.board.service.RandomNumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Log
@Controller
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueRandomController {

    @Autowired
    private RandomNumberService randNumService;

    @GetMapping("/random")
    @ResponseBody
    public ResponseEntity<RandomNumber> getRandom() {
        log.info("getRandom()");

        RandomNumber rand = randNumService.getRandom();

        return ResponseEntity.ok(rand);
    }
}
