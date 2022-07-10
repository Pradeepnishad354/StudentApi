package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.StudentRepository;
import com.rest.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
 public StudentRepository studentRepository;
	@Override
	public Student save(Student student) {
		
		return  this.studentRepository.save(student);
	}
	@Override
	public List<Student> getStudent() {
		
		return  studentRepository.findAll();
	}
	@Override
	public Student getStudent(Integer studentId) {
		
		return this.studentRepository.findById(studentId).get();
	}
	@Override
	public Student updateStudent(Student student) {
		studentRepository.save(student);
		return student; 
	}
	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	


}
