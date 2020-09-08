package cn.cqswxy.ssm.service;


import cn.cqswxy.ssm.entity.User;

public interface UserService {

	User getLogin(User user);
	
	Integer addRegister(User user);
}
