package com.pruebamongodb.controller;

import com.pruebamongodb.model.Datos;
import com.pruebamongodb.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/data")
    public List<Datos> getData(){

        List<Datos> datos = dataRepository.findAll();

        System.out.println(datos);

        return datos;
    }

}
