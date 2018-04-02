package com.wagawin.solution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.solution.model.ParentSummary;
import com.wagawin.solution.repository.ParentSummaryRepository;

@RestController
@RequestMapping("/persons")
public class ParentSummaryController {

	@Autowired
	ParentSummaryRepository parentSummaryRepository;

	@GetMapping("/children")
	public List<ParentSummary> getALL() {
		return parentSummaryRepository.findAll();
	}
}
