package com.mfg.service;

import java.util.List;

import com.mfg.entity.Student;

public interface StudentService {

	public void addStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteEmployee(Integer employeeId);
}
