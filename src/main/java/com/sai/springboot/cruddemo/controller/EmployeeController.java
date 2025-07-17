package com.sai.springboot.cruddemo.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.springboot.cruddemo.entity.Employee;
import com.sai.springboot.cruddemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    
    @GetMapping("/list")
    public String employeeList(Model theModel) {
    	
    	List<Employee> Employees = employeeService.findAll();
    	
    	theModel.addAttribute("employees",Employees);
    	
    	return "employees/list-employees";
    }
    
    @GetMapping("/showFormForAdd")
    public String addEmployee(Model theModel) {
    	
    	Employee theEmployee = new Employee();
    	
    	theModel.addAttribute("employee",theEmployee);
    	
    	return "employees/employee-form";
    	
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("EmployeeId") int theId,Model theModel) {
    	
    	Employee theEmployee = employeeService.findById(theId);
    	
    	theModel.addAttribute("employee", theEmployee);
    	
    	return "employees/employee-form";
    }
    
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("EmployeeId") int theId) {
    	
    	employeeService.deleteById(theId);
    	
    	return "redirect:/employees/list";
    }
    
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
    	
    	employeeService.save(theEmployee);
    	
    	return "redirect:/employees/list";
    }
}
