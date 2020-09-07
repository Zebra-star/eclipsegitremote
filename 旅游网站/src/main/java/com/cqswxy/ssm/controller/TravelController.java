package com.cqswxy.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cqswxy.ssm.entity.AirTicketBooking;
import com.cqswxy.ssm.entity.ReserveTicket;
import com.cqswxy.ssm.entity.SpecialPurchase;
import com.cqswxy.ssm.entity.User;
import com.cqswxy.ssm.service.UserService;

@Controller
public class TravelController {

	@Autowired
	private UserService userService;

	// 订机票页面
	@RequestMapping("AirTicketBooking")
	public ModelAndView AirTicketBooking(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/html/AirTicketBooking.html");
		return modelAndView;
	}

	// 旅游资讯页面
	@RequestMapping("TravelInformation")
	public ModelAndView TravelInformation(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/html/TravelInformation.html");
		return modelAndView;
	}
	// 风景欣赏页面
	@RequestMapping("SceneryAppreciation")
	public ModelAndView SceneryAppreciation(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/html/SceneryAppreciation.html");
		return modelAndView;
	}
	
	// 登录页面跳转
	@RequestMapping("login")
	public ModelAndView login(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/html/login.html");
		return modelAndView;
	}

	// 注册页面跳转
	@RequestMapping("register")
	public ModelAndView register(ModelAndView modelAndView) {
		modelAndView.setViewName("/WEB-INF/html/register.html");
		return modelAndView;
	}

	// 判断用户名是否存在
	@RequestMapping("ifNameExist")
	@ResponseBody
	public String ifNameExist(String userName) {
		int result = userService.selectByName(userName);
		System.out.println(result);
		// return modelAndView;
		String msg = "";
		if (result == 1) {
			msg = "ok";
		} else {
			msg = "no";
		}
		return msg;
	}

	// 用户注册
	@RequestMapping("userRegister")
	public ModelAndView userRegister(ModelAndView modelAndView, String userName, String userEmail,
			String userPassword) {
		User user = new User();
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		userService.insertAUser(user);
		modelAndView.setViewName("redirect:login.do");
		return modelAndView;
	}

	// 用户登录
	@RequestMapping("userlogin")
	@ResponseBody
	public String userlogin(HttpServletRequest request, String userEmail, String userPassword) {
		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		User selectUser = userService.selectUser(user);
		String msg = "";
		if (selectUser != null) {
			msg = "ok";
			HttpSession session = request.getSession();
			session.setAttribute("user", selectUser.getUserName());
			System.out.println(selectUser.getUserName());
			System.out.println(session.getAttribute("user"));
		} else {
			msg = "no";
		}
		return msg;
	}

	// 主页面
	@RequestMapping("mainPage")
	public ModelAndView mainPage(ModelAndView modelAndView) {

		modelAndView.setViewName("/WEB-INF/html/HomePage.html");

		return modelAndView;
	}

	@RequestMapping("userState")
	@ResponseBody
	public String userState(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String name = "";
		System.out.println(session.getAttribute("user"));
		if (session.getAttribute("user") != null) {
			name = (String) session.getAttribute("user");
		}
		return name;
	}

	@RequestMapping("orderTicket")
	@ResponseBody
	public String orderTicket(String uid, String type, String startingCity, String arriveCity, String startTime,
			String arriveTime) {

		AirTicketBooking airTicketBooking = new AirTicketBooking();
		airTicketBooking.setUid(uid);
		airTicketBooking.setType(type);
		airTicketBooking.setStartingCity(startingCity);
		airTicketBooking.setArriveCity(arriveCity);
		airTicketBooking.setStartTime(startTime);
		airTicketBooking.setArriveTime(arriveTime);
		userService.insertTicket(airTicketBooking);
		
		return null;
	}
	
	
	//添加预定机票信息
	@RequestMapping("reserveTicket")
	@ResponseBody
	public String reserveTicket(String uid,String line,String date,String price,String flight) {
		
		ReserveTicket reserveTicket = new ReserveTicket();
		reserveTicket.setUid(uid);
		reserveTicket.setLine(line);
		reserveTicket.setDate(date);
		reserveTicket.setPrice(price);
		reserveTicket.setFlight(flight);
		userService.insertPreTicket(reserveTicket);
		
		return null;
	}
	
	//添加特价购买信息信息
	@RequestMapping("SpecialPurchase")
	@ResponseBody
	public String SpecialPurchase(String uid,String line) {
		
		SpecialPurchase specialPurchase = new SpecialPurchase();
		specialPurchase.setUid(uid);
		specialPurchase.setLine(line);
		userService.insertSpecialPurchase(specialPurchase);
		return null;
	}
	
	
	//销毁session用户
	@RequestMapping("destorySession")
	@ResponseBody
	public String destorySession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return null;
	}
	
	

}
