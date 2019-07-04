package com.qa.persistence.domain;

import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Algorithm")
public class Algorithm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "algID")
	private Long algID;

	@Column(name = "Name")
	private String name;

	@Column(name = "Moves")
	private String moves;

	@Column(name = "Scramble")
	private String scramble;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "algID", nullable = false, insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<TimeLog> timeLogs;

	@Column(name = "userID")
	private Long userID;

	public Algorithm() {

	}

	public Algorithm(Long algID, String name, String moves, String scramble, List<TimeLog> timeLogs, Long userID) {
		super();
		this.algID = algID;
		this.name = name;
		this.moves = moves;
		this.scramble = scramble;
		this.timeLogs = timeLogs;
		this.userID = userID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getAlgID() {
		return algID;
	}

	public void setAlgID(Long algID) {
		this.algID = algID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoves() {
		return moves;
	}

	public void setMoves(String moves) {
		this.moves = moves;
	}

	public String getScramble() {
		return scramble;
	}

	public void setScramble(String scramble) {
		this.scramble = scramble;
	}

	public List<TimeLog> getTimeLogs() {
		return timeLogs;
	}

	public void setTimeLogs(List<TimeLog> timeLogs) {
		this.timeLogs = timeLogs;
	}

	@Override
	public String toString() {
		return String.format("Algorithm[algID=" + algID + ", Name=" + name + ", Moves=" + moves + ", Scramble="
				+ scramble + ", TimeLog=" + timeLogs + "]", algID, name, moves, scramble, timeLogs);
	}
}
