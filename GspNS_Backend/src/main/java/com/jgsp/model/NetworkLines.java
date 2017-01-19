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
@Table(name = "NetworkLines")
public class NetworkLines implements Serializable{

	private static final long serialVersionUID = -767454479493270209L;
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "busStopId")  
    private BusStop busStop;
	
	@ManyToOne
    @JoinColumn(name = "busLineId")  
    private BusLine busLine;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BusStop getBusStop() {
		return busStop;
	}
	public void setBusStop(BusStop busStop) {
		this.busStop = busStop;
	}
	public BusLine getBusLine() {
		return busLine;
	}
	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}
    
    

}
