package com.cqswxy.ssm.service;

import com.cqswxy.ssm.entity.AirTicketBooking;
import com.cqswxy.ssm.entity.ReserveTicket;
import com.cqswxy.ssm.entity.SpecialPurchase;
import com.cqswxy.ssm.entity.User;

public interface UserService {

	Integer selectByName(String userName);

	Integer insertAUser(User user);
	
	User selectUser(User user);
	
	Integer insertTicket(AirTicketBooking airTicketBooking);
	
	Integer insertPreTicket(ReserveTicket reserveTicket);
	
	Integer insertSpecialPurchase(SpecialPurchase specialPurchase);

}
