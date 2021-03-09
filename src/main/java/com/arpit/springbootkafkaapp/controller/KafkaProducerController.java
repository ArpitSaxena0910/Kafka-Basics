package com.arpit.springbootkafkaapp.controller;

import com.arpit.springbootkafkaapp.Entity.Employee;
import com.arpit.springbootkafkaapp.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        kafkaProducerService.sendMessage(message);
    }

    @PostMapping(value = "/createEmp")
    public void sendEmpDetailsToKafka(@RequestParam("EmpId") long empId,
        @RequestParam("FirstName") String firstName,
        @RequestParam("LastName") String lastName){

        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);

        kafkaProducerService.publishEmpToKafka(employee);
    }
}
