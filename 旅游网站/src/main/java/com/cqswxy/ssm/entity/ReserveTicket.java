package com.cqswxy.ssm.entity;

import java.util.Date;

public class ReserveTicket {

	private Integer id;
	private String uid;
	private String line;
	private String date;
	private String price;
	private String flight;
	
	
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


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getFlight() {
		return flight;
	}


	public void setFlight(String flight) {
		this.flight = flight;
	}


	@Override
	public String toString() {
		return "ReserveTicket [id=" + id + ", uid=" + uid + ", line=" + line + ", date=" + date + ", price=" + price
				+ ", flight=" + flight + "]";
	}
	
	
	
	
}
