package cn.cqswxy.ssm.service;

import cn.cqswxy.ssm.entity.User;

public interface UserService {

	User selectByAccess(User user);
	
}
