package com.wagawin.solution.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.solution.model.Child;
import com.wagawin.solution.model.Meal;
import com.wagawin.solution.model.Person;
import com.wagawin.solution.repository.ChildRepository;
import com.wagawin.solution.repository.MealRepository;
import com.wagawin.solution.repository.PersonRepository;

@RestController
@RequestMapping("/child")
public class ChildController {

	@Autowired
	MealRepository mealRepository;

	@Autowired
	ChildRepository childRepository;

	@Autowired
	PersonRepository personRepository;

	@PostMapping("/info")
	public Map<String, Object> findPersonHouse(@Valid @RequestBody Child child) {

		Map<String, Object> response = new HashMap<>();

		Child foundChild = childRepository.findByName(child.getName());

		if (foundChild != null) {

			Person person = foundChild.getPerson();

			response.put("parent", person.getName());

			List<Meal> meals = mealRepository.findMealByChild(foundChild);

			if (!meals.isEmpty()) {
				response.put("favorite meal", meals.get(0).getName());
			}
		}
		return response;
	}

}
