package com.qa.business;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Algorithm;
import com.qa.persistence.domain.TimeLog;
import com.qa.persistence.repository.AlgorithmRepository;
import com.qa.persistence.repository.TimeLogRepository;

@Service
public class TimeLogServiceImpl implements TimeLogService {

	@Autowired
	private TimeLogRepository timeRepo;

	@Override
	public String createTimeLog(String time, Long algID) {
		TimeLog aTimeLog = new TimeLog();
		aTimeLog.setTime(time);
		aTimeLog.setAlgID(algID);
		timeRepo.save(aTimeLog);
		return "TimeLog created";
	}

	@Override
	public List<TimeLog> getAllTimeLogs() {
		return timeRepo.findAll();
	}

	@Override
	public TimeLog getATimeLog(Long timeID) {
		return timeRepo.findById(timeID).get();
	}

	@Override
	public String get3Avg(Long userID, Long algID) {
		// TODO Auto-generated method stub
		return "Average got";
	}

	@Override
	public String updateTimeLog(String time, Long algID, Long timeID) {
		TimeLog aTimeLog = getATimeLog(timeID);

		aTimeLog.setTime(time);
		aTimeLog.setAlgID(algID);

		return "TimeLog " + timeID + " updated";
	}

	@Override
	public boolean deleteTimeLog(Long timeID) {
		timeRepo.deleteById(timeID);
		return timeRepo.existsById(timeID);
	}

}
