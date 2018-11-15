package com.contactbook.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.contactbook.contact.entity.Contact;
import com.contactbook.contact.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	 @GetMapping("/contact/{name}")
	 public Contact getContactDetails(@PathVariable String name){
		 System.out.println("Controller: " + name);
		 return contactService.getContact(name);
	 }
	 
	 @GetMapping("/contact/id/{id}")
	 public Contact getContact(@PathVariable Integer id){
		 System.out.println("Controller id: " + id);
		 return contactService.getId(id);
	 }
}
