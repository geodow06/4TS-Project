package com.qa.business;

import java.util.List;
import java.util.Optional;
import com.qa.persistence.domain.*;

public interface TimeLogService {
	// C
	public String createTimeLog(String time, Long algId);

	// R
	public List<TimeLog> getAllTimeLogs();

	public TimeLog getATimeLog(Long timeID);

	public String get3Avg(Long userId, Long algID);

	// U
	public String updateTimeLog(String time, Long algId, Long timeID);

	// D
	public boolean deleteTimeLog(Long timeID);

//	int cycleUsers(String user_name);
}