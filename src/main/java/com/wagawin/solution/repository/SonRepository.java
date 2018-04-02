package com.wagawin.solution.repository;

import com.wagawin.solution.model.Son;

public interface SonRepository extends ChildRepository {
	Son findByName(String name);

}
