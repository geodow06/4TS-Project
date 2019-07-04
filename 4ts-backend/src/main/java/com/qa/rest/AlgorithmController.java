package com.qa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.AlgorithmServiceImpl;
import com.qa.persistence.domain.Algorithm;

@RestController
public class AlgorithmController {

	@Autowired
	private AlgorithmServiceImpl svc;

	@RequestMapping("/addAlgorithm/{name}/{moves}/{scramble}/{userID}")
	public String createAlgorithm(@PathVariable String name, @PathVariable String moves, @PathVariable String scramble,
			@PathVariable Long userID) {
		return svc.createAlgorithm(name, moves, scramble, userID);
	}

	@RequestMapping("/getAllAlgorithms")
	public List<Algorithm> getAllAlgorithms() {

		return svc.getAllAlgorithms();
	}

	@RequestMapping("/getAnAlgorithm/{algID}")
	public Algorithm getAnAlgorithm(@PathVariable Long algID) {

		return svc.getAnAlgorithm(algID);
	}

	@RequestMapping("/updateAlgorithm/{name}/{moves}/{scramble}/{algID}")
	public String updateAlgorithm(@PathVariable String name, @PathVariable String moves, @PathVariable String scramble,
			@PathVariable Long algID) {

		return svc.updateAlgorithm(name, moves, scramble, algID);
	}

	@RequestMapping("/deleteAlgorithm/{algID}")
	public boolean deleteAlgorithm(@PathVariable Long algID) {

		return svc.deleteAlgorithm(algID);
	}

	@RequestMapping("/getRandomAlgorithm/{userID}")
	public Algorithm getRandomAlgorithm(@PathVariable Long userID) {
		return svc.getRandomAlgorithm(userID);
	}
}
