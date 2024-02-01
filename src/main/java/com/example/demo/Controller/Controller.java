package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Services1;
import com.example.demo.Student.Student;

@RestController
public class Controller {

	@Autowired
	public Services1 service;

	// display student detail using JpaRepository
	@GetMapping("Student/Display")
	public List<Student> getStudentDetail() {
		List<Student> s1 = service.GetStudentDetails();
		return s1;
	}

	// display Student detail using Native Query
	@GetMapping("Student/Display2")
	public List<Student> getStudentDetail2() {
		List<Student> s1 = service.GetStudentDetails2();
		return s1;
	}
	

	// Save the student using JpaRepository
	@PostMapping("/Student/SaveData")
	public ResponseEntity<Student> SaveData(@RequestBody Student s) {
		Student s1 = service.SaveData(s);
		return ResponseEntity.ok().body(s1);
	}

	// Update student detail using JpaRepository
	@PutMapping("/Student/Update")
	public Student Update(@RequestBody Student s) {
		return this.service.Update(s);
	}

	// Delete student Detail Using JpaRepository
	@DeleteMapping("/Student/{Id}")
	public void Delete(@PathVariable int RollNo) {
		service.Delete(RollNo);
	
	}

}
