package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilterService {

    public List<String> filter(List<String> userDetails) {
        return userDetails.stream().filter(this::doesMatch).collect(Collectors.toList());
    }

    private boolean doesMatch(String userDetails) {
        return userDetails.matches("[A-Za-z0-9]+");
    }

}
