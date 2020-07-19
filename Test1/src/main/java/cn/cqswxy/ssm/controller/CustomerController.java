package cn.cqswxy.ssm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.cqswxy.ssm.entity.Customer;
import cn.cqswxy.ssm.service.CustomerService;
import cn.cqswxy.ssm.service.DictService;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private DictService dictService;
	
	
	@RequestMapping("mainPage")
	public ModelAndView mainPage(ModelAndView modelAndView,Integer pageNum,Customer customer) {
		modelAndView.addObject("list",customerService.getList(customer,pageNum));
		List<Customer> list = customerService.getList(customer,pageNum);
		PageInfo<Customer> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getNextPage());
		
		modelAndView.addObject("sources",dictService.getList("002"));
		modelAndView.addObject("industries",dictService.getList("001"));
		modelAndView.addObject("pageInfo",pageInfo);
		
		modelAndView.setViewName("/WEB-INF/jsp/mainPage.jsp");
		return modelAndView;
		
	}
	@RequestMapping("deleteSubmit")
	public ModelAndView deleteSubmit(ModelAndView modelAndView,Integer[] id) {
		customerService.delSome(id);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	@RequestMapping("insertPage")
	public ModelAndView insertPage(ModelAndView modelAndView) {
		modelAndView.addObject("sources",dictService.getList("002"));
		modelAndView.addObject("industries",dictService.getList("001"));
		modelAndView.setViewName("/WEB-INF/jsp/insertPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("insertSubmit")
	public ModelAndView insertSubmit(ModelAndView modelAndView,Customer customer) {
		
		customer.setCustCreateId(1);
		customerService.addOne(customer);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	@RequestMapping("updatePage")
	public ModelAndView updatePage(ModelAndView modelAndView,Integer id) {
		modelAndView.addObject("oneList",customerService.selectById(id));
	//	modelAndView.addObject("sources",dictService.getList(customerService.selectById(id).getCustSource()));
	//	modelAndView.addObject("industries",dictService.getList(customerService.selectById(id).getCustIndustry()));
		modelAndView.addObject("sources",dictService.getList("002"));
		modelAndView.addObject("industries",dictService.getList("001"));
		modelAndView.setViewName("/WEB-INF/jsp/updatepage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("updateSubmit")
	public ModelAndView updateSubmit(ModelAndView modelAndView,Customer customer,Integer id) {
		customer.setCustCreateId(id);
		customerService.modOne(customer);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	
}
