package com.cqswxy.ssm.mapper;

import org.springframework.stereotype.Repository;

import com.cqswxy.ssm.entity.AirTicketBooking;
import com.cqswxy.ssm.entity.ReserveTicket;
import com.cqswxy.ssm.entity.SpecialPurchase;
import com.cqswxy.ssm.entity.User;


@Repository
public interface UserMapper {
	
	Integer selectByName(String userName);
	
	Integer insertAUser(User user);
	
	User selectUser(User user);
	
	Integer insertTicket(AirTicketBooking airTicketBooking);
	
	Integer insertPreTicket(ReserveTicket reserveTicket);
	
	Integer insertSpecialPurchase(SpecialPurchase specialPurchase);
	
	
}
