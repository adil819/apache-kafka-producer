package com.enigma.kafka.apachekafkaproducer.service;


import com.enigma.kafka.apachekafkaproducer.config.KafkaConfig;
import com.enigma.kafka.apachekafkaproducer.model.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(EmailMessage message) {
        this.kafkaTemplate.send(KafkaConfig.TOPIC, message.getEmailBody());
    }
}
