package com.datum.tes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.datum.tes.models.enums.zone;
@Entity
@Table(name = "enum_zone")
public class enum_zone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "zone_ID")
	private long id;
	@Column(name = "zone", nullable = false, columnDefinition = "enum('Kathmandu','Lalitpur','Bhaktapur','Chitwan','Nuwakot')")
	@Enumerated(EnumType.STRING)	
	private zone zone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public zone getZone() {
		return zone;
	}
	public void setZone(zone zone) {
		this.zone = zone;
	}
	@Override
	public String toString() {
		return "enum_zone [id=" + id + ", zone=" + zone + "]";
	}
}
