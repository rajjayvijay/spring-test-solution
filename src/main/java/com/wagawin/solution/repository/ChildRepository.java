package com.wagawin.solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagawin.solution.model.Child;
import com.wagawin.solution.model.Person;

public interface ChildRepository extends JpaRepository<Child, Integer> {
	Child findByName(String name);

	Person findByPerson(Person person);

}
