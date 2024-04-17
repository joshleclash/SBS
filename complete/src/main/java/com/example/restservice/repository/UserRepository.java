package com.example.restservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.restservice.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}