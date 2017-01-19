package com.jgsp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BusStop")
public class BusStop implements Serializable{

	private static final long serialVersionUID = 3506874061586269939L;
	
	@Id
	@Column(name="busStopId")
	@GeneratedValue
    private Long busStopId;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
	@Column(name="name")
	private String name;
	
	@Column(name="zone")
	private String zone;
	
	@OneToMany(mappedBy = "busStop")
	private Set<NetworkLines> networkLines;
	
	/*@ManyToMany
    @JoinTable(
    		name="networkLines",
    		joinColumns={@JoinColumn(name="busStopId")},
    		inverseJoinColumns={@JoinColumn(name="busLineId")})
	private Set<BusLine> busLines;*/

	public Long getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(Long busStopId) {
		this.busStopId = busStopId;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Set<NetworkLines> getNetworkLines() {
		return networkLines;
	}

	public void setNetworkLines(Set<NetworkLines> networkLines) {
		this.networkLines = networkLines;
	}



	/*public Set<BusLine> getBusLines() {
		return busLines;
	}

	public void setBusLines(Set<BusLine> busLines) {
		this.busLines = busLines;
	}*/
	
	
	

}
