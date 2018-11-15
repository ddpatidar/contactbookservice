package com.contactbook.contact.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Getter
@Setter
public class Contact {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="empid")
	private String empid;
}
