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
@Table(name="BusTime")
public class BusTime implements Serializable{

	private static final long serialVersionUID = -1414391509448911740L;
	
	@Id
	@Column(name="id")
	@GeneratedValue
    private Long id;
	
	@ManyToOne
	@JoinColumn(name="timeTableId")
	private TimeTable timeTable;
	
	@Column(name="hour00")
	private Integer hour00;
	
	@Column(name="hour01")
	private Integer hour01;
	
	@Column(name="hour02")
	private Integer hour02;
	
	@Column(name="hour03")
	private Integer hour03;
	
	@Column(name="hour04")
	private Integer hour04;
	
	@Column(name="hour05")
	private Integer hour05;
	
	@Column(name="hour06")
	private Integer hour06;
	
	@Column(name="hour07")
	private Integer hour07;
	
	@Column(name="hour08")
	private Integer hour08;
	
	@Column(name="hour09")
	private Integer hour09;
	
	@Column(name="hour10")
	private Integer hour10;
	
	@Column(name="hour11")
	private Integer hour11;
	
	@Column(name="hour12")
	private Integer hour12;
	
	@Column(name="hour13")
	private Integer hour13;
	
	@Column(name="hour14")
	private Integer hour14;
	
	@Column(name="hour15")
	private Integer hour15;
	
	@Column(name="hour16")
	private Integer hour16;
	
	@Column(name="hour17")
	private Integer hour17;
	
	@Column(name="hour18")
	private Integer hour18;
	
	@Column(name="hour19")
	private Integer hour19;
	
	@Column(name="hour20")
	private Integer hour20;
	
	@Column(name="hour21")
	private Integer hour21;
	
	@Column(name="hour22")
	private Integer hour22;
	
	@Column(name="hour23")
	private Integer hour23;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TimeTable getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}

	public Integer getHour00() {
		return hour00;
	}

	public void setHour00(Integer hour00) {
		this.hour00 = hour00;
	}

	public Integer getHour01() {
		return hour01;
	}

	public void setHour01(Integer hour01) {
		this.hour01 = hour01;
	}

	public Integer getHour02() {
		return hour02;
	}

	public void setHour02(Integer hour02) {
		this.hour02 = hour02;
	}

	public Integer getHour03() {
		return hour03;
	}

	public void setHour03(Integer hour03) {
		this.hour03 = hour03;
	}

	public Integer getHour04() {
		return hour04;
	}

	public void setHour04(Integer hour04) {
		this.hour04 = hour04;
	}

	public Integer getHour05() {
		return hour05;
	}

	public void setHour05(Integer hour05) {
		this.hour05 = hour05;
	}

	public Integer getHour06() {
		return hour06;
	}

	public void setHour06(Integer hour06) {
		this.hour06 = hour06;
	}

	public Integer getHour07() {
		return hour07;
	}

	public void setHour07(Integer hour07) {
		this.hour07 = hour07;
	}

	public Integer getHour08() {
		return hour08;
	}

	public void setHour08(Integer hour08) {
		this.hour08 = hour08;
	}

	public Integer getHour09() {
		return hour09;
	}

	public void setHour09(Integer hour09) {
		this.hour09 = hour09;
	}

	public Integer getHour10() {
		return hour10;
	}

	public void setHour10(Integer hour10) {
		this.hour10 = hour10;
	}

	public Integer getHour11() {
		return hour11;
	}

	public void setHour11(Integer hour11) {
		this.hour11 = hour11;
	}

	public Integer getHour12() {
		return hour12;
	}

	public void setHour12(Integer hour12) {
		this.hour12 = hour12;
	}

	public Integer getHour13() {
		return hour13;
	}

	public void setHour13(Integer hour13) {
		this.hour13 = hour13;
	}

	public Integer getHour14() {
		return hour14;
	}

	public void setHour14(Integer hour14) {
		this.hour14 = hour14;
	}

	public Integer getHour15() {
		return hour15;
	}

	public void setHour15(Integer hour15) {
		this.hour15 = hour15;
	}

	public Integer getHour16() {
		return hour16;
	}

	public void setHour16(Integer hour16) {
		this.hour16 = hour16;
	}

	public Integer getHour17() {
		return hour17;
	}

	public void setHour17(Integer hour17) {
		this.hour17 = hour17;
	}

	public Integer getHour18() {
		return hour18;
	}

	public void setHour18(Integer hour18) {
		this.hour18 = hour18;
	}

	public Integer getHour19() {
		return hour19;
	}

	public void setHour19(Integer hour19) {
		this.hour19 = hour19;
	}

	public Integer getHour20() {
		return hour20;
	}

	public void setHour20(Integer hour20) {
		this.hour20 = hour20;
	}

	public Integer getHour21() {
		return hour21;
	}

	public void setHour21(Integer hour21) {
		this.hour21 = hour21;
	}

	public Integer getHour22() {
		return hour22;
	}

	public void setHour22(Integer hour22) {
		this.hour22 = hour22;
	}

	public Integer getHour23() {
		return hour23;
	}

	public void setHour23(Integer hour23) {
		this.hour23 = hour23;
	}
	
	


}
