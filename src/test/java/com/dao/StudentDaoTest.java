package com.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dao.dao.StudentDao;
import com.dao.dao.StudentDaoImpl;
import com.dao.domain.Student;

public class StudentDaoTest {

	private StudentDao studentDao;
	
	@Before
	public void setUp() {
		studentDao = new StudentDaoImpl();
	}
	
	@Test
	public void validateInserts() {
		Student student = new Student("Mike", 70);
		studentDao.addStudent(student);
		assertNotNull(studentDao.getStudent(70));
		assertEquals(student.getName(), studentDao.getStudent(student.getRollNo()).getName());
	}
	
	@Test
	public void validateDeletes() {
		Student student = new Student("Mike", 70);
		studentDao.addStudent(student);
		studentDao.deleteStudent(student);
		assertNull(studentDao.getStudent(student.getRollNo()));
	}
	
}
