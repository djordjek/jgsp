package com.jgsp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Coordinate")
public class Coordinate implements Serializable{

	private static final long serialVersionUID = -4072174512496620344L;
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@Column(name="coordinates")
	private String coordinates;
	
	@ManyToOne
	@JoinColumn(name="busLineId")
	private BusLine busLine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public BusLine getBusLine() {
		return busLine;
	}

	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}
	
	

}
