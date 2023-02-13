package com.API.Bokk1.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "Code_Topic",groupId = "code")
	public void listentotopic(String receivedmessage)
	{
		System.out.println("the message received is"+receivedmessage);
		
	}
	
	
}
