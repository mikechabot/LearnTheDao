package com.dao.dao;

import java.util.List;

import com.dao.domain.Student;

public interface StudentDao {

   List<Student> getAllStudents();
   Student getStudent(int rollNo);
   void addStudent(Student student);
   void updateStudent(Student student);
   void deleteStudent(Student student);

}
