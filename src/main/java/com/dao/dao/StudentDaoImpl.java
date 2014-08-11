package com.dao.dao;

import java.util.ArrayList;
import java.util.List;

import com.dao.domain.Student;

public class StudentDaoImpl implements StudentDao {
	
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student: Roll No " + student.getRollNo() + ", added to database");
	}

	@Override
	public void deleteStudent(Student student) {
		Student temp = getStudent(student.getRollNo());
		if (temp != null) {
			students.remove(temp);
			System.out.println("Student: Roll No " + temp.getRollNo() + ", deleted from database");
			return;
		}
		System.out.println("Removal failed, student not found (Roll No: "+ student.getRollNo());
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		for (Student each : getAllStudents()) {
			if (each.getRollNo() == rollNo) return each;
		}
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}



}
