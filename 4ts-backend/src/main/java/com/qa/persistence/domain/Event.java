package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eventID")
	private Long eventID;
	
	@Column(name = "EventName") 
	private String eventName;  
	
	@Column(name = "Details") 
	private String details;
	
	@Column(name = "Attendees") 
	private List<String> Attendees; 
	
	
}
