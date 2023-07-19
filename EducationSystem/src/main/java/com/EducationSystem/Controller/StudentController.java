package com.EducationSystem.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EducationSystem.Entity.Student;
import com.EducationSystem.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/postStudentDetails")
	public String postMethod(@RequestBody Student student) {
		 
		studentService.postStudentDetails(student);
		
		return  "Student Details are added";
		
		
	}
	
	
	@GetMapping("/allData")
	public List<Student> getAllStudents () {
		return studentService.getStudents();
	
		 
		
	}

//	@GetMapping("/allDataById/{id}")
//	public Student getById(@PathVariable int id) {
//		return studentService.getStudentDataById(id);
//		
//	}
//	
//	@GetMapping("/allDataByname/{sName}")
//	public Student getByname(@PathVariable ("name") String sName) {
//		return studentService.getByStudentName(sName);
//		
//	}
}
