package com.student_service.kafkaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendStudentEvent(String studentData) {
	    kafkaTemplate.send("student-topic", studentData);
	}


}
