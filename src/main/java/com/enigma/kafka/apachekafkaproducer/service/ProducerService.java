package com.enigma.kafka.apachekafkaproducer.service;

import com.enigma.kafka.apachekafkaproducer.model.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ProducerService {

    public void sendMessage(EmailMessage message) throws JsonProcessingException;

}
