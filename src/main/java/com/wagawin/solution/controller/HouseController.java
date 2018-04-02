package com.wagawin.solution.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.solution.model.House;
import com.wagawin.solution.model.Person;
import com.wagawin.solution.repository.HouseRepository;
import com.wagawin.solution.repository.PersonRepository;

@RestController
@RequestMapping("/")
public class HouseController {

	@Autowired
	HouseRepository houseRepository;

	@Autowired
	PersonRepository personRepository;
 

	@PostMapping("/house")
	public House findPersonHouse(@Valid @RequestBody Person person) {

		List<Person> foundPersons = personRepository.findByName(person.getName());

		if (foundPersons.size() > 0)
			return houseRepository.findByPerson(foundPersons.get(0));
		else
			return null;
	}

}
