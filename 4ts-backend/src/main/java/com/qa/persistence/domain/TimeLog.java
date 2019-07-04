package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "TimeLog")
public class TimeLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "timeID")
	private Long timeID;

	@Column(name = "Times")
	private String time;

	@Column(name = "algID")
	private Long algID;

	public TimeLog(Long timeID, String time, Long algID) {
		super();
		this.timeID = timeID;
		this.time = time;
		this.algID = algID;
	}

	public TimeLog() {

	}

	public Long getAlgID() {
		return algID;
	}

	public void setAlgID(Long algID) {
		this.algID = algID;
	}

	public Long getTimeID() {
		return timeID;
	}

	public void setTimeID(Long timeID) {
		this.timeID = timeID;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return String.format("TimeLog[timeID=" + timeID + ", time=" + time + ", algID=" + algID + "]", timeID, time,
				algID);
	}

}