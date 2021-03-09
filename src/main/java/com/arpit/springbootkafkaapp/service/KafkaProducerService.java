package com.arpit.springbootkafkaapp.service;

import com.arpit.springbootkafkaapp.Entity.Employee;
import com.arpit.springbootkafkaapp.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class KafkaProducerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String msg){
        logger.info("Message sent -> {}",msg);
        this.kafkaTemplate.send(AppConstants.TOPIC_NAME, msg);
    }

    public void publishEmpToKafka(Employee employee){
        logger.info("Employee added to Kafka -> {}",employee);
        kafkaTemplate.send(AppConstants.TOPIC_NAME_EMPLOYEE,employee);
    }
}
