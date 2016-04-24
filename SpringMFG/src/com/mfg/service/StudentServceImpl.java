package com.mfg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfg.dao.StudentDAO;
import com.mfg.entity.Student;

@Service("studentService")

public class StudentServceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;
	@Override
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.addStudent(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=studentDAO.getAllStudents();
		return students;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		studentDAO.deleteEmployee(employeeId);
	}

}
