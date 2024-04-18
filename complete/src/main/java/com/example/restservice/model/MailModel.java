package com.example.restservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "mail")
public class MailModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String message_id;
  private String response;
  private String email;
  private Long timestamp_webhook;
  private String fromaddress;
  private String event;
  private Long msize;
  private String customargs1;
  private String customargs2;
  private String tags;

  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMessage() {
    return message_id;
  }

  public void setMessage(String args) {
    this.message_id = args;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String args) {
    this.response = args;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String args) {
    this.email = args;
  }

  public Long getTimeStampWebhook() {
    return timestamp_webhook;
  }

  public void setTimeStampWebhook(long args) {
    this.timestamp_webhook = args;
  }

  public String getFromAdress() {
    return fromaddress;
  }

  public void setFromAdress(String args) {
    this.fromaddress = args;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String args) {
    this.event = args;
  }

  public Long getMSize() {
    return msize;
  }

  public void setMSize(Long args) {
    this.msize = args;
  }

  public String getCustomArgs1() {
    return customargs1;
  }

  public void setCustomArgs1(String args) {
    this.customargs1 = args;
  }

  public String getCustomArgs2() {
    return customargs2;
  }

  public void setCustomArgs2(String args) {
    this.customargs2 = args;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String args) {
    this.tags = args;
  }

}