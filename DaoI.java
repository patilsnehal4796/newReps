package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface DaoI
{
	int addStudent(Student student);
	List<Student> allData(Student s);
	Student editStudent(int rno);
	List<Student> updateStudent(Student student);
	List<Student> deleteStudent(int rno);


}
