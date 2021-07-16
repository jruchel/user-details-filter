package com.example.demo.controllers;


import com.example.demo.services.FilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filter")
@RequiredArgsConstructor
public class FilterController {

    private final FilterService filterService;

    @PostMapping
    public ResponseEntity<List<String>> filterUserDetails(@RequestBody List<String> userDetails) {
        List<String> response = filterService.filter(userDetails);
        return ResponseEntity.ok(response);
    }

}
