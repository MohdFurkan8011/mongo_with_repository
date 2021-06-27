package com.mongo.repository.mongo_repository.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.repository.mongo_repository.modal.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
