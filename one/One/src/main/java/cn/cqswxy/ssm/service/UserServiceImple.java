package cn.cqswxy.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.ssm.entity.User;
import cn.cqswxy.ssm.mapper.UserMapper;

@Service
public class UserServiceImple implements UserService{

	@Autowired
	private UserMapper mapper;

	@Override
	public User getLogin(User user) {
		return mapper.selectLogin(user);
	}

	@Override
	public Integer addRegister(User user) {
		return mapper.Register(user);
	}

}
