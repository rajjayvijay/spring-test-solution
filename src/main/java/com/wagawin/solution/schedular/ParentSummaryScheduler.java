package com.wagawin.solution.schedular;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wagawin.solution.model.ParentSummary;
import com.wagawin.solution.repository.ParentSummaryRepository;

@Component
public class ParentSummaryScheduler {

	@Autowired
	EntityManager em;

	@Autowired
	ParentSummaryRepository parentSummaryRepository;

	@Scheduled(fixedRate = 900000)
	public void run() throws InterruptedException {
		System.out.println("cron job = " + new Date());

		// Empty the table
		parentSummaryRepository.deleteAll();

		Query query = em.createNativeQuery(
				"Select x as id, x as amountofchildren, count(*) as amountofpersons from ( SELECT count(*) as x FROM child c group by person_id ) as t group by x",
				"ParentSummaryMapping");

		List<ParentSummary> parentSummaryList = query.getResultList();

		if (parentSummaryList != null && parentSummaryList.size() > 0) {
			parentSummaryRepository.saveAll(parentSummaryList);
		}
	}
}
