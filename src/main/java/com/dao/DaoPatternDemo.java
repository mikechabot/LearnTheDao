package com.dao;

import com.dao.dao.StudentDao;
import com.dao.dao.StudentDaoImpl;
import com.dao.domain.Student;

public class DaoPatternDemo {

	public static void main(String[] args) {

	      StudentDao studentDao = new StudentDaoImpl();

	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }

	      //update student
	      Student student = studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName( ) + " ]");		
	   }

	}