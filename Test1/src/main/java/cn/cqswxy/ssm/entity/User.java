package cn.cqswxy.ssm.entity;

public class User {

	private Integer userId;
	private String userAccess;
	private String userPasswd;
	private String userRealName;
	private Boolean userFlag;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserAccess() {
		return userAccess;
	}
	public void setUserAccess(String userAccess) {
		this.userAccess = userAccess;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public Boolean getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(Boolean userFlag) {
		this.userFlag = userFlag;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccess=" + userAccess + ", userPasswd=" + userPasswd
				+ ", userRealName=" + userRealName + ", userFlag=" + userFlag + "]";
	}
	
	
}
