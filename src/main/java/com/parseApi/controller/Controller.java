package com.parseApi.controller;

import com.parseApi.model.User;
import com.parseApi.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private  final ServiceLayer serviceLayer;
    @Autowired
    public Controller(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    @GetMapping("/user")
    public ResponseEntity<User> getData() {
        return new ResponseEntity<>(serviceLayer.getApi(), HttpStatus.OK);

    }

}
