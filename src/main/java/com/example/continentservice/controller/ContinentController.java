package com.example.continentservice.controller;

import com.example.continentservice.service.ContinentService;
import com.example.continentservice.utils.ContinentConstants;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {
    private final ContinentService continentService;

    public ContinentController(@Qualifier(ContinentConstants.continentService) ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping("/fetch")
    public String fetchContinents() {
        continentService.fetchAndStoreContinents();
        return "Continents fetched and stored successfully";
    }
}
