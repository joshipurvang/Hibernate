package com.mfg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mfg.entity.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {


    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public void addStudent(Student student) {
    	this.sessionFactory.getCurrentSession().beginTransaction();
        this.sessionFactory.getCurrentSession().saveOrUpdate(student);
        this.sessionFactory.getCurrentSession().getTransaction().commit();
        this.sessionFactory.getCurrentSession().close();
        
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getAllStudents() {
        return this.sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
    @Override
    public void deleteEmployee(Integer employeeId) {
    	Student employee = (Student) sessionFactory.getCurrentSession().load(
    			Student.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
}
    
}
