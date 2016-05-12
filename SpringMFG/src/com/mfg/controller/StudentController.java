package com.mfg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mfg.model.Student;
import com.mfg.service.StudentService;
@Controller

public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	   public ModelAndView student() {
		System.out.println("Hello M in controller");
	      return new ModelAndView("student", "command", new Student());
	   }
	   
	   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
	   ModelMap model) {
		   
		   System.out.println("Hello M in addstrudent controller");
	      model.addAttribute("name", student.getName());
	      model.addAttribute("age", student.getAge());
	      model.addAttribute("id", student.getId());
	      com.mfg.entity.Student studentEntity=new com.mfg.entity.Student();
	      studentEntity.setId(Integer.parseInt(student.getId()));
	      studentEntity.setName(student.getName());
	      studentEntity.setAge(student.getAge());
	      studentService.addStudent(studentEntity);
	      
	      return "result";
	   }
	
}
