package com.wagawin.solution.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagawin.solution.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findByName(String name);

	Person findById(Long id);

}
