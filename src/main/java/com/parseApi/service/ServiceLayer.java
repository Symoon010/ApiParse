package com.parseApi.service;

import com.parseApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
    private  final RestTemplate restTemplate;

    @Autowired
    public ServiceLayer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public User getApi(){
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",User.class);
    }
}
