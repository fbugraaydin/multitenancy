package com.fbugraaydin.multitenancy.service;

import com.fbugraaydin.multitenancy.entity.Data;
import com.fbugraaydin.multitenancy.repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private final DataRepository dataRepository;

    DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<Data> getData() {
        return dataRepository.findAll();
    }
}
