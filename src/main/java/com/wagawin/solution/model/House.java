package com.wagawin.solution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "house", catalog = "wagawin")
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	 
	private String address;

	 
	private String zipcode;

 
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private HouseType type;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;

	public House() {

	}

	public House(long id, String address, String zipcode, HouseType type, Person person) {
		this.id = id;
		this.address = address;
		this.zipcode = zipcode;
		this.type = type;
		this.person = person;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public HouseType getType() {
		return type;
	}

	public void setType(HouseType type) {
		this.type = type;
	}

}
