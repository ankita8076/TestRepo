package com.EducationSystem.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationSystem.Entity.Student;
import com.EducationSystem.Repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	static
StudentRepository studentRepo;

	public Student postStudentDetails(Student student) {
	return	studentRepo.save(student);
		}
	
	public List<Student> postStudentDetails(List<Student> students) {
		return (List<Student>) studentRepo.saveAll(students);
		
	}
	
	
	public List<Student>getStudents(){
		return (List<Student>) studentRepo.findAll();
		
	}

	public Student  getStudentDataById(int id) {
		
		return studentRepo.findById(id).orElse(null);
	}

	public Student getByStudentName(String sName) {
		
		return studentRepo.findByName(sName).orElse(null);
	}

}
