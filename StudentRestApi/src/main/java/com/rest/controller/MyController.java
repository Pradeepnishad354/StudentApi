package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Student;
import com.rest.service.StudentService;

@RestController
public class MyController {
	
@Autowired
public StudentService studentService;	


// create student
@RequestMapping(value="/addstudent",method=RequestMethod.POST)
public Student save(@RequestBody Student student ) {
return studentService.save(student);
		
	}


//find the all student
@RequestMapping(value="/findstudent",method=RequestMethod.GET)
public List<Student> getStudent(){
	
	return this.studentService.getStudent();
	
}
// find single student
@RequestMapping(value="/findstudent/{studentId}",method=RequestMethod.GET)
public Student getStudent(@PathVariable Integer studentId) {
	return this.studentService.getStudent(studentId);
}

// update the student
@RequestMapping(value="/updatestudent",method=RequestMethod.PUT)
public Student updateCourse(@RequestBody Student student) {
	
	return studentService.updateStudent(student);
}


//delete the student
@RequestMapping(value="/delete/{studentId}",method=RequestMethod.DELETE)
public String deleteStudent(@PathVariable int studentId) {
studentService.deleteStudent(studentId);
return "student  delete successfully";

}

}
