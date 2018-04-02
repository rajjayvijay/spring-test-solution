package com.wagawin.solution.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagawin.solution.model.House;
import com.wagawin.solution.model.Person;

public interface HouseRepository extends JpaRepository<House, Integer> {
	House findByPerson(Person person);

}
