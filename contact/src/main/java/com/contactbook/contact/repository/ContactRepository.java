package com.contactbook.contact.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.contactbook.contact.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{
	
	//@Query("select f.id from Contact f order by f.id")
	//String getNames(String name);
	
	Contact findByName(String name);
	
	//Optional<Contact> findById(Integer id);
	
}
