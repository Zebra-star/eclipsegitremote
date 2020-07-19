package cn.cqswxy.ssm.entity;

import java.util.Date;

public class Customer {

	
	private Integer custId;
	private String custName;
	private Integer custUserId;
	private Integer custCreateId;
	private String custSource;
	private String custIndustry;
	private String custPhone;
	private String custMobile;
	private String custAddress;
	private Date custCreateDate;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Integer getCustUserId() {
		return custUserId;
	}
	public void setCustUserId(Integer custUserId) {
		this.custUserId = custUserId;
	}
	public Integer getCustCreateId() {
		return custCreateId;
	}
	public void setCustCreateId(Integer custCreateId) {
		this.custCreateId = custCreateId;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Date getCustCreateDate() {
		return custCreateDate;
	}
	public void setCustCreateDate(Date custCreateDate) {
		this.custCreateDate = custCreateDate;
	}
	private Dict source;
	
	public Dict getSource() {
		return source;
	}
	public void setSource(Dict source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custUserId=" + custUserId
				+ ", custCreateId=" + custCreateId + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custPhone=" + custPhone + ", custMobile=" + custMobile + ", custAddress=" + custAddress
				+ ", custCreateDate=" + custCreateDate + ", source=" + source + "]";
	}
	
	
	
}
