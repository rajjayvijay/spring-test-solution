package com.wagawin.solution.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagawin.solution.model.Child;
import com.wagawin.solution.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Integer> {

	List<Meal> findMealByChild(Child child);
}
