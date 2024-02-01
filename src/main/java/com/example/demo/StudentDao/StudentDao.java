package com.example.demo.StudentDao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Student.Student;


public interface StudentDao extends JpaRepository<Student,Serializable>{

	@Query(value="select * from Student" ,nativeQuery=true)
	List<Student> GetStudentDetails2();

	

}
