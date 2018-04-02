package com.wagawin.solution.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.solution.model.Daughter;
import com.wagawin.solution.model.House;
import com.wagawin.solution.model.HouseType;
import com.wagawin.solution.model.Meal;
import com.wagawin.solution.model.Person;
import com.wagawin.solution.model.Son;
import com.wagawin.solution.repository.ChildRepository;
import com.wagawin.solution.repository.DaughterRepository;
import com.wagawin.solution.repository.HouseRepository;
import com.wagawin.solution.repository.MealRepository;
import com.wagawin.solution.repository.PersonRepository;
import com.wagawin.solution.repository.SonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	MealRepository mealRepository;

	@Autowired
	ChildRepository childRepository;

	@Autowired
	SonRepository sonRepository;

	@Autowired
	HouseRepository houseRepository;

	@Autowired
	DaughterRepository daughterRepository;


	@GetMapping("/addDetails")
	public void addDetailsToTables() throws Exception {

		addPerson();

		addSecond();

		addThird();

		addFour();

	}

	private void addFour() throws ParseException {
		// Another person
		Person person = new Person();

		person.setId(4);
		person.setName("QWXD HWGB");
		person.setAge(9);
		House house = new House(4, "BTLMAYOUT 2nd Stage, Bangalore", "560076", HouseType.FLAT, person);
		person.setHouse(house);

		personRepository.save(person);
		houseRepository.save(house);

		Son son = new Son();
		son.setId(6);
		son.setName("QSDDW D");
		son.setAge(4);
		son.setBicycleColor("Blue");
		son.setPerson(person);

		sonRepository.save(son);

		Son son2 = new Son();
		son2.setId(7);
		son2.setName("QSDDW D");
		son2.setAge(14);
		son2.setBicycleColor("Blue");
		son2.setPerson(person);

		sonRepository.save(son2);

		Son son3 = new Son();
		son3.setId(8);
		son3.setName("WW QSDDW D");
		son3.setAge(14);
		son3.setBicycleColor("Blue");
		son3.setPerson(person);

		sonRepository.save(son3);

	}

	private void addThird() throws ParseException {
		// Another person
		Person person = new Person();

		person.setId(3);
		person.setName("WEAD HWGB");
		person.setAge(4);
		House house = new House(3, "BTLMAYOUT 2nd Stage, Bangalore", "560076", HouseType.FLAT, person);
		person.setHouse(house);

		personRepository.save(person);
		houseRepository.save(house);

		Son son = new Son();
		son.setId(5);
		son.setName("WDEFE");
		son.setAge(4);
		son.setBicycleColor("Blue");
		son.setPerson(person);

		sonRepository.save(son);

	}

	private void addSecond() throws ParseException {
		// Another person
		Person person = new Person();

		person.setId(2);
		person.setName("Sonal Raj");
		person.setAge(36);
		House house = new House(2, "BTLMAYOUT 2nd Stage, Bangalore", "560076", HouseType.FLAT, person);
		person.setHouse(house);

		personRepository.save(person);
		houseRepository.save(house);

		Son son = new Son();
		son.setId(3);
		son.setName("XYA");
		son.setAge(4);
		son.setBicycleColor("Blue");
		son.setPerson(person);

		sonRepository.save(son);

		Daughter daughter = new Daughter();
		daughter.setId(4);
		daughter.setName("SEE");
		daughter.setAge(13);
		daughter.setHairColor("Brown");
		daughter.setPerson(person);

		daughterRepository.save(daughter);
	}

	private void addPerson() throws ParseException {
		Person person = new Person();

		person.setId(1);
		person.setName("Jayvijay Raj");
		person.setAge(36);
		House house = new House(1, "BTLMAYOUT 2nd Stage, Bangalore", "560076", HouseType.FLAT, person);
		person.setHouse(house);

		personRepository.save(person);
		houseRepository.save(house);

		Son son = new Son();
		son.setId(1);
		son.setName("Aarav");
		son.setAge(4);
		son.setBicycleColor("Red");
		son.setPerson(person);

		sonRepository.save(son);

		Meal meal1 = new Meal();
		meal1.setId(1);
		meal1.setName("French Fries");
		meal1.setInvented(new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2016"));
		meal1.setChild(son);

		mealRepository.save(meal1);

		Meal meal2 = new Meal();
		meal2.setId(2);
		meal2.setName("Pizza");
		meal2.setInvented(new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2016"));
		meal2.setChild(son);

		mealRepository.save(meal2);

		Daughter daughter = new Daughter();
		daughter.setId(2);
		daughter.setName("Riya");
		daughter.setAge(11);
		daughter.setHairColor("Brown");
		daughter.setPerson(person);

		daughterRepository.save(daughter);

		Meal meal3 = new Meal();
		meal3.setId(3);
		meal3.setName("Tomato Pasta & Fries");
		meal3.setInvented(new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2006"));
		meal3.setChild(daughter);

		mealRepository.save(meal3);

		Meal meal4 = new Meal();
		meal4.setId(4);
		meal4.setName("Pizza & Coke");
		meal4.setInvented(new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2009"));
		meal4.setChild(daughter);

		mealRepository.save(meal4);
	}

}
