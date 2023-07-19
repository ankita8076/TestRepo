package com.EducationSystem.Repository;



import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.EducationSystem.Entity.Student;

@Repository
public interface StudentRepository extends  CrudRepository<Student, Integer> {

	Optional<Student> findByName(String sName);

}
