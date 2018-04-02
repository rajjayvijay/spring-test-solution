package com.wagawin.solution.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.solution.model.Child;
import com.wagawin.solution.model.Daughter;
import com.wagawin.solution.model.Son;
import com.wagawin.solution.repository.ChildRepository;
import com.wagawin.solution.repository.DaughterRepository;
import com.wagawin.solution.repository.SonRepository;

@RestController
@RequestMapping("/")
public class ColorController {

	@Autowired
	ChildRepository childRepository;

	@Autowired
	SonRepository sonRepository;

	@Autowired
	DaughterRepository daughterRepository;

	@PostMapping("/color")
	public Map<String, Object> findColor(@Valid @RequestBody Child child) {

		Map<String, Object> response = new HashMap<>();

		Child foundChild = childRepository.findByName(child.getName());

		if (foundChild != null) {

			if (foundChild instanceof Son) {
				Son son = sonRepository.findByName(foundChild.getName());
				response.put("bicycleColor", son.getBicycleColor());
			} else if (foundChild instanceof Daughter) {
				Daughter daughter = daughterRepository.findByName(foundChild.getName());
				response.put("hairColor", daughter.getHairColor());
			}
		}
		return response;
	}

}
