package com.example.gmail;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
@RestController
public class sendMailController {
	@Autowired
	GmailApplication sendingEmailApplication;

	@RequestMapping(value = "/sendemail")
	public String send() throws AddressException, MessagingException, IOException {
	   //sendEmail();
		sendingEmailApplication.sendEmail();
	   return "Email sent successfully";   
	}
}
