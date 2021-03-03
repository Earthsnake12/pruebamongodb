package com.pruebamongodb.repository;

import com.pruebamongodb.model.Datos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<Datos,String> {

}
