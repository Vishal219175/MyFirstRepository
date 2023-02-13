package com.API.Bokk1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	
	public void sendMsgToTopic(String message)
	{
		
		kafkaTemplate.send("Code_Topic",message);
		
	}
	
	
	
}
