package com.enigma.kafka.apachekafkaproducer.service;


import com.enigma.kafka.apachekafkaproducer.config.KafkaConfig;
import com.enigma.kafka.apachekafkaproducer.model.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void sendMessage(EmailMessage message) throws JsonProcessingException {
        String emailMessage = objectMapper.writeValueAsString(message);
        this.kafkaTemplate.send(KafkaConfig.TOPIC, message.getEmailBody());
    }
}
