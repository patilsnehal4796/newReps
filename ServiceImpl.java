package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.DaoI;
import com.cjc.model.Student;

@Service
public class ServiceImpl implements ServiceI
{
	@Autowired
	private DaoI daoI;
	
	@Override
	public int addStudent(Student student) 
	{
		System.out.println("In Sercice add Students");
		int i=daoI.addStudent(student);
			return i;
	}

	@Override
	public List<Student> allData(Student s) 
	{ 
		System.out.println("In Service All data");
		List<Student>list=daoI.allData(s);
			return list;
	}

	@Override
	public Student editStudent(int rno) 
	{
		System.out.println("In service edit Student");
		Student s=daoI.editStudent(rno);
		return s;
	}

	@Override
	public List<Student> updateStudent(Student student)
	{
		System.out.println("In service Layer Update Student");
		List<Student>list=daoI.updateStudent(student);
		return list;
	}

	@Override
	public List<Student> deleteStudent(int rno)
	{
		System.out.println("In service delete Student");
		List<Student> list=daoI.deleteStudent(rno);
		return list;
	}

}
