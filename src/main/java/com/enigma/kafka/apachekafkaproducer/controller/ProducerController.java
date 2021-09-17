package com.enigma.kafka.apachekafkaproducer.controller;

import com.enigma.kafka.apachekafkaproducer.model.EmailMessage;
import com.enigma.kafka.apachekafkaproducer.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailMessage message) throws JsonProcessingException {
        producerService.sendMessage(message);
        return "Email has been sent!";
    }
}
