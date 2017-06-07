package com.wb.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wb.entity.Employee;
import com.wb.entity.Person;
import com.wb.util.SystemTip;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(Model model,HttpServletRequest request){
		Person person = new Person();
		person.setName("张三");
		person.setAge(18);
		model.addAttribute("person1", person);
		
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(person);
		listPerson.add(person);
		listPerson.add(person);
		listPerson.add(person);
		listPerson.add(person);
		model.addAttribute("listPerson", listPerson);
		
		request.setAttribute("say", "Hello World");
		
		request.setAttribute("moneyDouble", 1.12510212);
		request.setAttribute("moneyBigDecimal", new BigDecimal(2.5261231));
		request.setAttribute("systemDate", new Date());
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public SystemTip login(Employee emp){
		System.out.println(emp);
		return SystemTip.createSuccessTip();
	}
	
}
