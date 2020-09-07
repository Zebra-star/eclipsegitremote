package com.cqswxy.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqswxy.ssm.entity.AirTicketBooking;
import com.cqswxy.ssm.entity.ReserveTicket;
import com.cqswxy.ssm.entity.SpecialPurchase;
import com.cqswxy.ssm.entity.User;
import com.cqswxy.ssm.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Integer selectByName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.selectByName(userName);
	}

	@Override
	public Integer insertAUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertAUser(user);
	}

	@Override
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUser(user);
	}

	@Override
	public Integer insertTicket(AirTicketBooking airTicketBooking) {
		// TODO Auto-generated method stub
		return userMapper.insertTicket(airTicketBooking);
	}

	@Override
	public Integer insertPreTicket(ReserveTicket reserveTicket) {
		// TODO Auto-generated method stub
		return userMapper.insertPreTicket(reserveTicket);
	}

	@Override
	public Integer insertSpecialPurchase(SpecialPurchase specialPurchase) {
		// TODO Auto-generated method stub
		return userMapper.insertSpecialPurchase(specialPurchase);
	}


}
