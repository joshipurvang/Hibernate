package com.mfg.dao;

import java.util.List;

import com.mfg.entity.Student;

public interface StudentDAO {
	
	public void addStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteEmployee(Integer employeeId);

}
