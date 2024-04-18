package com.example.restservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.MailModel;
import com.example.restservice.repository.MailRepository;
import com.example.restservice.request.MailEventData;

@RestController
@RequestMapping("webhook")
public class WebHookController {
    @Autowired
    MailRepository repository;

    @PostMapping(path = "/mail/save")
    public ResponseEntity saveEmailLogs(@org.springframework.web.bind.annotation.RequestBody MailEventData[] request) {
        List<MailModel> obj = new ArrayList<>();
        for (MailEventData item : request) {
            MailModel row = new MailModel();
            row.setMessage(item.getSg_message_id());
            row.setResponse(item.getResponse());
            row.setEmail(item.getEmail());
            row.setTimeStampWebhook(item.getTimestamp());
            row.setFromAdress(item.getFromaddress());
            row.setEvent(item.getEvent());
            row.setMSize(item.getMsize());
            row.setCustomArgs1(item.getCustomargs1());
            row.setCustomArgs2(item.getCustomargs2());
            row.setTags(item.getTags());
            obj.add(row);
        }
        List<MailModel> afectedRows = repository.saveAll(obj);
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("data", afectedRows.size());
        response.put("message", "informacion almacenada correctamente");

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

    @GetMapping(path = "/get")
    public ResponseEntity getAllUsers() {
        // This returns a JSON or XML with the users
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("data", repository.findAll());
        response.put("message", "informacion obtenida correctamente");
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

}
