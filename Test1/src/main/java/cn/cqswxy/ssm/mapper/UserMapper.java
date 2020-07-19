package cn.cqswxy.ssm.mapper;

import org.springframework.stereotype.Repository;

import cn.cqswxy.ssm.entity.User;
@Repository
public interface UserMapper {

	User selectByAccess(User user);
}
