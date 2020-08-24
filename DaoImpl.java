package com.cjc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public class DaoImpl implements DaoI
{
	@Autowired
	private SessionFactory sf;

	@Override
	public int addStudent(Student student) 
	{
	    System.out.println("In a dao add");	
	    Session session=sf.openSession();
	    
	    session.save(student);
	    session.beginTransaction().commit();
		return student.getRno();
	}

	@Override
	public List<Student> allData(Student s) 
	{
		Boolean flag=false;
		Session session=sf.openSession();
		Query<Student> query=session.createQuery("form Student");
		
		List<Student>list=query.list();
		System.out.println("All user Data");
		
		for(Student s1:list)
		{
			if(s.getUname().equals(s1.getUname())&&s.getPass().equals(s1.getPass()))
			{
				flag=false;
				break;
				
				
			}
			
		}
		if(flag=true) 
		{
		return list;	
			
		}
			
		return new ArrayList<Student>();
	}

	@Override
	public Student editStudent(int rno)
	{
	   System.out.println("In dao edit ");
	   Session session=sf.openSession();
	  Student s= session.get(Student.class,rno);
		return s;
	}

	@Override
	public List<Student> updateStudent(Student student) {
		System.out.println("In dao update");
		Session session=sf.openSession();
		session.beginTransaction();
		
		session.update(student);
		session.getTransaction().commit();
		session.close();
		
		Session session2=sf.openSession();
		Query<Student> query=session.createQuery("from Student");
		List<Student>list=query.getResultList();
		return list;
	}

	@Override
	public List<Student> deleteStudent(int rno) 
	{
		System.out.println("In dao deleting");
		Session session=sf.openSession();
		session.beginTransaction();
		Student student=session.get(Student.class,rno);
		session.delete(student);
		session.getTransaction().commit();
		
		Session session2=sf.openSession();
		Query<Student> query=session.createQuery("from Student");
		List<Student>list=query.getResultList();
				return list;
	}

}
