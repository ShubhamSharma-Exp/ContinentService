package com.example.continentservice.service.impl;

import com.example.continentservice.entity.Continent;
import com.example.continentservice.repository.ContinentRepository;
import com.example.continentservice.service.ContinentService;
import com.example.continentservice.utils.ContinentConstants;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;
    private final RestTemplate restTemplate;

    public ContinentServiceImpl(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
        this.restTemplate = new RestTemplate();
    }


    @Override
    public void fetchAndStoreContinents() {
        String url = ContinentConstants.url;
        Continent[] continents = restTemplate.getForObject(url, Continent[].class);

        if(continents != null) {
            List<Continent> continentList = Arrays.asList(continents);
            continentRepository.saveAll(continentList);
        }
    }
}
