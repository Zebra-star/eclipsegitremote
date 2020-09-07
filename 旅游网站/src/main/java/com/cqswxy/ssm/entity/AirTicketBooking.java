package com.cqswxy.ssm.entity;

public class AirTicketBooking {

	private Integer id;
	private String uid;
	private String type;
	private String startingCity;
	private String arriveCity;
	private String startTime;
	private String arriveTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStartingCity() {
		return startingCity;
	}
	public void setStartingCity(String startingCity) {
		this.startingCity = startingCity;
	}
	public String getArriveCity() {
		return arriveCity;
	}
	public void setArriveCity(String arriveCity) {
		this.arriveCity = arriveCity;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
	@Override
	public String toString() {
		return "airTicketBooking [id=" + id + ", uid=" + uid + ", type=" + type + ", startingCity=" + startingCity
				+ ", arriveCity=" + arriveCity + ", startTime=" + startTime + ", arriveTime=" + arriveTime + "]";
	}
	
	
}
