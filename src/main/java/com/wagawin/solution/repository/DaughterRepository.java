package com.wagawin.solution.repository;

import com.wagawin.solution.model.Daughter;

public interface DaughterRepository extends ChildRepository {
	Daughter findByName(String name);

}
