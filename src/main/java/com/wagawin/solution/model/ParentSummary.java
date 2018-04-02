package com.wagawin.solution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

//@SqlResultSetMappings({ @SqlResultSetMapping(name = "ParentSummaryMapping", entities = {
//		@EntityResult(entityClass = ParentSummary.class), @EntityResult(entityClass = ParentSummary.class) })
//
//})
@Entity
@Table(name = "parentsummary", catalog = "wagawin")
@SqlResultSetMapping(name = "ParentSummaryMapping", entities = @EntityResult(entityClass = ParentSummary.class, fields = {
		@FieldResult(name = "id", column = "id"), 
		@FieldResult(name = "amountofpersons", column = "amountofpersons"),
		@FieldResult(name = "amountofchildren", column = "amountofchildren") }
))
public class ParentSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "amountofpersons")
	private long amountofpersons;

	@Column(name = "amountofchildren")
	private long amountofchildren;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAmountOfPersons() {
		return amountofpersons;
	}

	public void setAmountOfPersons(long amountofpersons) {
		this.amountofpersons = amountofpersons;
	}

	public long getAmountOfChildren() {
		return amountofchildren;
	}

	public void setAmountOfChildren(long amountofchildren) {
		this.amountofchildren = amountofchildren;
	}

}
