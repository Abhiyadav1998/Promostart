package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.services.ContactServices;


@Controller
public class ContactController {
	
	
	@Autowired
	private ContactServices contactService;
	
	
	//public ContactController(ContactServices contactService) {
		//this.contactService = contactService;
	//}


	@RequestMapping("/listallcontacts")
	public String listallcontacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}

}
