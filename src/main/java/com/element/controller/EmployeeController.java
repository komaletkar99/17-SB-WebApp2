package com.element.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.element.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/getEmployee")
	public String getEmpData(Model model) {
		Employee employee = new Employee(101, "Pooja", "pune", 24);
		model.addAttribute("e", employee);
		return "emp";
	}
	
	@GetMapping("/getAllEmployee")
	public String getAllEmpData(Model model) {
		Employee employee1 = new Employee(101, "Pooja", "Pune", 24);
		Employee employee2 = new Employee(101, "Komal", "Mumbai", 24);
		Employee employee3 = new Employee(103, "Sarthak", "Delhi", 24);
		Employee employee4 = new Employee(104, "Yash", "pune", 24);
		
		List<Employee> list = new ArrayList<>();
		list.add(employee4);
		list.add(employee3);     
		list.add(employee2);
		list.add(employee1);
		

		model.addAttribute("e", list);
		return "emps";
	}
	
}

