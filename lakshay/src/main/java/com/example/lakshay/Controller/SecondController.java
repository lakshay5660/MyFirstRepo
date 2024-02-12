package com.example.lakshay.Controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lakshay.model.Student;

@RestController
public class SecondController {
	
	@GetMapping("/second")
	public ArrayList<String> secondpage()
	{
		ArrayList<String> name =new ArrayList<String>();
		name.add("lakshay");
		name.add("prashant");
		name.add("dhawal");
		name.add("akshay");
		return name;
	}
	@GetMapping("/student")
	public ArrayList<Student> studentpage()
	{
		ArrayList<Student> stu =new ArrayList<Student>();
		stu.add(new Student(1,"Lakshay","Btech"));
		stu.add(new Student(2,"Prashant","MCA"));	
		return stu;
	}
}
