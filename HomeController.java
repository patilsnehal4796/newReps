package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.ServiceI;

@Controller
public class HomeController
{
	@Autowired
  private ServiceI serviceI;
	
	@RequestMapping("/reg")
	public String m1(@ModelAttribute Student student)
	{
		System.out.println(student.getAddress());
		System.out.println("In Controller");
		int i=serviceI.addStudent(student);
		System.out.println(i);
		return "index";
				
	}
	
	@RequestMapping("/log")
	public String allData(@ModelAttribute Student s,Model m)
	{
		System.out.println("UserName"+s.getUname());
		System.out.println("password"+s.getPass());
		List<Student>list=serviceI.allData(s);
		m.addAttribute("data",list);
		
		return "success";
		
	}
	@RequestMapping("/edit{rno}")
	public String editStudent(@RequestParam ("rd")int rno,Model m )
	{
		System.out.println(rno);
		Student s=serviceI.editStudent(rno);
		m.addAttribute("student",s);
		return "edit";
		
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		System.out.println("From Update Controller");
		List<Student>list=serviceI.updateStudent(s);
		m.addAttribute("data",list);
		return "success";
		
	}
	@RequestMapping("/del{rd}")
	public String deleteStudent(@RequestParam ("rd")int rno,Model m)
	{
	   List<Student>list=serviceI.deleteStudent(rno);
	   m.addAttribute("data",list);
		return "success";
		
		
		
	}
}

