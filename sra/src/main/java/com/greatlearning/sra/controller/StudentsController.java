package com.greatlearning.sra.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.greatlearning.sra.entity.Student;
import com.greatlearning.sra.service.StudentService;

public class StudentsController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/listing")
	public String listAllStudents(Model modelObj) {
		
		List<Student> allStudents 
			= studentService.findAll();
		
		modelObj.addAttribute("students", allStudents);
		
		return "student-lister";
	}
}

}
