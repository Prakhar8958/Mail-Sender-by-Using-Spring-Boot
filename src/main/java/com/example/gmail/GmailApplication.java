package com.example.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@SpringBootApplication
public class GmailApplication {

	@Autowired
    private JavaMailSender javaMailSender;

	public static void main(String[] args) 
	{
		SpringApplication.run(GmailApplication.class, args);
	}



		void sendEmail() 
		{

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("pks8958saxena@gmail.com");

	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("Hello World \n Spring Boot Email");

	        javaMailSender.send(msg);

	    }
	
	
}
