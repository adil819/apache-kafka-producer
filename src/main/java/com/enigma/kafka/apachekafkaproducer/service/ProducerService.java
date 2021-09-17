package com.enigma.kafka.apachekafkaproducer.service;

import com.enigma.kafka.apachekafkaproducer.model.EmailMessage;

public interface ProducerService {

    public void sendMessage(EmailMessage message);

}
