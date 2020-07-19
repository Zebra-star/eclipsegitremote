package cn.cqswxy.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.ssm.entity.User;
import cn.cqswxy.ssm.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByAccess(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectByAccess(user);
	}
	
	
	
}
