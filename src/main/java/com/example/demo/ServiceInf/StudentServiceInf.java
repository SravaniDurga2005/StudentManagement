package com.example.demo.ServiceInf;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentServiceInf {
	
	public Student createStudent(Student stu);
	public Student updateStudent(Long id,Student stu);
	public String deleteStudent(Long id);
	public Student getbyid(Long id);
	public List<Student> getAll();
	
	

}
