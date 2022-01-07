package com.fbugraaydin.multitenancy.controller;

import com.fbugraaydin.multitenancy.entity.Data;
import com.fbugraaydin.multitenancy.service.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DataController {

    private final DataService service;

    public DataController(DataService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Data>> getData() {
        return new ResponseEntity<>(service.getData(), HttpStatus.OK);
    }

}
