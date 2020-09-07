package com.cqswxy.ssm.entity;

public class SpecialPurchase {

	private Integer id;
	private String uid;
	private String line;
	
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
	@Override
	public String toString() {
		return "SpecialPurchase [id=" + id + ", uid=" + uid + ", line=" + line + "]";
	}
	
}
