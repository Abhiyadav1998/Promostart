package com.zohocrmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.dto.Email;
import com.zohocrmapp.util.EmailService;

@Controller
public class Emailcontroller {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email, Model model) {
        emailService.sendEMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "email send");
		return "compose_email";
		
	}

}
