package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.Entity.Student;
import com.example.demo.ServiceImpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private final StudentServiceImpl studentservice;
	
	public StudentController( StudentServiceImpl studentservice) {
		this.studentservice=studentservice;
	}
	
	@PostMapping
	public Student createStudent(@RequestBody Student s) {
		return studentservice.createStudent(s);
	}
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student s) {
		return studentservice.updateStudent(id, s);
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return studentservice.deleteStudent(id);
	}
	@GetMapping("/{id}")
	public Student findbyid(@PathVariable Long id) {
		return studentservice.getbyid(id);
	}
	@GetMapping
	public List<Student> getall() {
		return studentservice.getAll();
	}

}
