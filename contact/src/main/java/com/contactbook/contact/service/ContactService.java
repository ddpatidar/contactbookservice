package com.contactbook.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactbook.contact.entity.Contact;
import com.contactbook.contact.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	public Contact getContact(String name){
		System.out.println("Name: " + name);
		return contactRepository.findByName(name);
	}

	public Contact getId(Integer id){
		System.err.println("1---->"+id);
		System.err.println(contactRepository.findAll());
		return contactRepository.findById(id).get();
	}
}
