package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.ServiceInf.StudentServiceInf;

@Service
public class StudentServiceImpl implements StudentServiceInf {
	@Autowired
	private final  StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
		
	}

	@Override
	public Student createStudent(Student stu) {
		
		return studentRepository.save(stu);
	}

	@Override
	public Student updateStudent(Long id, Student stu) {
		Student s=studentRepository.findById(id).get();
		s.setName(stu.getName());
		s.setBranch(stu.getBranch());
		return studentRepository.save(s);
	}

	@Override
	public String deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public Student getbyid(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	 

}
