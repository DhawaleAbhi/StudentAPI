package com.example.demo.Service;

import java.util.List;

import com.example.demo.Student.Student;

public interface Services1 {

	public void Delete(int RollNo);

	public Student Update(Student s);

	public Student SaveData(Student s);

	public List<Student> GetStudentDetails2();

	public List<Student> GetStudentDetails();



}
