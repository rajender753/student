package com.student_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.student_service.kafkaservice.KafkaProducerService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private KafkaProducerService kafkaProducer;

	@GetMapping("/getStudent")
	public String getStudent() {
		String address = getAddress();
		this.kafkaProducer.sendStudentEvent("Hello Rajender");
		return "student" + "  " + address;
	}

	public Student saveStudent() {
		return new Student();
	}

	public String getAddress() {
		return webClientBuilder.build().get().uri("http://localhost:8081/address/getDetails").retrieve()
				.bodyToMono(String.class).block();
	}

}
