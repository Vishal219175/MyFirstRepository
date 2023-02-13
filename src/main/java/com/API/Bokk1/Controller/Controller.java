package com.API.Bokk1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.API.Bokk1.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class Controller {

	@Autowired
	Producer producer;
	
@GetMapping("/producermessage")
public void getmessage(@RequestParam("message") String message)
{
	
	producer.sendMsgToTopic(message);
	
}
	
	
	
}
