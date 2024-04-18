package com.example.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.model.MailModel;

@Repository
public interface MailRepository extends JpaRepository<MailModel, Long> {

}