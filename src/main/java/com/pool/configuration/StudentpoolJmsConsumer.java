package com.pool.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.pool.configuration.properties.StudentpoolProperties;
import com.pool.model.Email;

@Component
@EnableJms
@ConfigurationProperties("student-pool")
public class StudentpoolJmsConsumer {
	
	@JmsListener(destination = "topic.studentpool", containerFactory = "jmsListenerContainerFactory")
	public void receiveMessage(String email) {
		System.out.println(email);
	}
}
