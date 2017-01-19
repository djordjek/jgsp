package com.jgsp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jgsp.model.enumeration.Direction;

@Entity
@Table(name="BusLine")
public class BusLine implements Serializable{
	
	private static final long serialVersionUID = 3464447610746767539L;

	@Id
	@Column(name="busLineId")
	@GeneratedValue
	private Long busLineId;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="busNumber")
	private String busNumber;
	
	@NotNull
	@Enumerated(EnumType.ORDINAL)
    @Column(name = "directionId")
	private Direction direction;
	
	@OneToMany(mappedBy="busLine")
	private Set<TimeTable> timeTables;
	
	@OneToMany(mappedBy="busLine")
	private Set<Coordinate> coordinates;
	
	@OneToMany(mappedBy = "busLine")
	private Set<NetworkLines> networkLines;
	
	/*@ManyToMany
    @JoinTable(
    		name="networkLines",
    		joinColumns={@JoinColumn(name="busLineId")},
    		inverseJoinColumns={@JoinColumn(name="busStopId")})
	private Set<BusStop> busStop;*/

	public Long getBusLineId() {
		return busLineId;
	}

	public void setBusLineId(Long busLineId) {
		this.busLineId = busLineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Set<TimeTable> getTimeTables() {
		return timeTables;
	}

	public void setTimeTables(Set<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}

	public Set<Coordinate> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Set<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}

	public Set<NetworkLines> getNetworkLines() {
		return networkLines;
	}

	public void setNetworkLines(Set<NetworkLines> networkLines) {
		this.networkLines = networkLines;
	}
	
	

	/*public Set<BusStop> getBusStop() {
		return busStop;
	}

	public void setBusStop(Set<BusStop> busStop) {
		this.busStop = busStop;
	}*/
	
	
	
	

}
