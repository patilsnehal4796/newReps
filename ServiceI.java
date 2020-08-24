package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface ServiceI 
{
	int addStudent(Student student);
	List<Student> allData(Student s);
	Student editStudent(int rno);
	List<Student> updateStudent(Student student);
	List<Student> deleteStudent(int rno);
}
