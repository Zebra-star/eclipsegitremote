package cn.cqswxy.ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.cqswxy.ssm.entity.User;
import cn.cqswxy.ssm.service.UserService;

@Controller
@SessionAttributes(names="custCreateId",types = {User.class})
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("loginPage")
	public ModelAndView loginPage(ModelAndView modelAndView,User user) {
		
		if (userService.selectByAccess(user) != null) {
			System.out.println("通过");
			modelAndView.setViewName("redirect:mainPage.do");
		}else {
			modelAndView.setViewName("index.jsp");
			System.out.println("不通过");
		}
		return modelAndView;
	}
	
	
}
