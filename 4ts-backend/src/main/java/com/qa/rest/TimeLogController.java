package com.qa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.TimeLogServiceImpl;
import com.qa.persistence.domain.TimeLog;

@RestController
public class TimeLogController {

	@Autowired
	public TimeLogServiceImpl svc;

	@RequestMapping("/addTimeLog/{time}/{algID}")
	public String addTimeLog(@PathVariable String time, @PathVariable Long algID) {
		String result = svc.createTimeLog(time, algID);

		return result;
	}

	@RequestMapping("/getAllTimes")
	public List<TimeLog> getAllTimeLogs() {

		return svc.getAllTimeLogs();
	}

	@RequestMapping("/getATimeLog/{timeID}")
	public TimeLog getATimeLog(@PathVariable Long timeID) {

		return svc.getATimeLog(timeID);
	}

	@RequestMapping("/get3Avg/{userID}/{algID}")
	public String get3Avg(@PathVariable Long userId, @PathVariable Long algID) {

		return svc.get3Avg(userId, algID);
	}

	@RequestMapping("/updateTimeLog/{time}/{algID}/{timeID}")
	public String updateTimeLog(@PathVariable String time, @PathVariable Long algID, @PathVariable Long timeID) {

		return svc.updateTimeLog(time, algID, timeID);
	}

	@RequestMapping("/deleteTimeLog/{timeID}")
	public boolean deleteTimeLog(@PathVariable Long timeID) {

		return svc.deleteTimeLog(timeID);
	}
}
