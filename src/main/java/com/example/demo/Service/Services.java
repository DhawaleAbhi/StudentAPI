package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Controller.Controller;
import com.example.demo.Student.Student;
import com.example.demo.StudentDao.StudentDao;

import ch.qos.logback.classic.Logger;



@Service
public class Services implements Services1 {

	public static final Logger logger = (Logger) LoggerFactory.getLogger(Controller.class);
	@Autowired
	private StudentDao studDao;

	// Using JPA for update
	@Override
	public Student Update(Student s) {

		return studDao.save(s);
	}

	// Using JPA for delete
	@Override
	public void Delete(int RollNo) {

		studDao.deleteById(RollNo);
	}

	// Using JPA for save data
	@Override
	public Student SaveData(Student s) {
		return studDao.save(s);
	}

	// using Native Query for Display
	@Override
	public List<Student> GetStudentDetails2() {
		// TODO Auto-generated method stub
		return studDao.GetStudentDetails2();
	}

	// display details using JPA
	@Override
	public List<Student> GetStudentDetails() {
		// TODO Auto-generated method stub
		logger.info("inside the display all detail of Student");
		return studDao.findAll();
	}

}
