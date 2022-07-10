package com.rest.service;

import java.util.List;

import com.rest.model.Student;

public interface StudentService {
	
	public Student save(Student student);
	public List<Student> getStudent();
	public Student getStudent(Integer studentId);
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	
	
}
