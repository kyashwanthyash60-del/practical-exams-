package com.example.program20;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface StudentRepository extends MongoRepository<Student,String>{}
