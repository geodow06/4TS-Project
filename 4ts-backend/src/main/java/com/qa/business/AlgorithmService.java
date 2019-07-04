package com.qa.business;

import java.util.List;
import java.util.Optional;
import com.qa.persistence.domain.*;

public interface AlgorithmService {
	// C
	public String createAlgorithm(String name, String moves, String scramble, Long userID);

	// R
	public List<Algorithm> getAllAlgorithms();

	public Algorithm getRandomAlgorithm(Long userID);

	public Algorithm getAnAlgorithm(Long algID);

	public Long getRandomAlgID(Long userID);

	// U
	public String updateAlgorithm(String name, String moves, String scramble, Long algID);

	// D
	public boolean deleteAlgorithm(Long algID);

}
