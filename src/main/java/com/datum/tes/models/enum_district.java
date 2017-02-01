package com.datum.tes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.datum.tes.models.enums.district;
@Entity
@Table(name = "enum_district")
public class enum_district {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "district_ID")
	private long id;
	@Column(name = "district", nullable = false, columnDefinition = "enum('Mechi','Koshi','Sagarmatha','Janakpur','Bagmati')")
	@Enumerated(EnumType.STRING)
	private district district;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public district getDistrict() {
		return district;
	}
	public void setDistrict(district district) {
		this.district = district;		
	}
	@Override
	public String toString() {
		return "enum_district [id=" + id + ", district=" + district + "]";
	}
}
