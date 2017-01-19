package com.jgsp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jgsp.model.enumeration.Day;
import com.jgsp.model.enumeration.Type;

@Entity
@Table(name="TimeTable")
public class TimeTable implements Serializable{

	private static final long serialVersionUID = 5782413907957881620L;
	
	@Id
	@Column(name="id")
	@GeneratedValue
    private Long id;
	
	@NotNull
	@Enumerated(EnumType.ORDINAL)
    @Column(name = "dayId")
	private Day day;
	
	@NotNull
	@Enumerated(EnumType.ORDINAL)
    @Column(name = "typeId")
	private Type type;
	
	@ManyToOne
	@JoinColumn(name="busLineId")
	private BusLine busLine;
	
	@OneToMany(mappedBy="timeTable")
	private Set<BusTime> busTimes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public BusLine getBusLine() {
		return busLine;
	}

	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}

	public Set<BusTime> getBusTimes() {
		return busTimes;
	}

	public void setBusTimes(Set<BusTime> busTimes) {
		this.busTimes = busTimes;
	} 
	
	

}
