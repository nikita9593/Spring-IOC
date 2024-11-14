package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.College;
import com.Entity.Department;
import com.Entity.Student;

public class ApplicationContextContainerTest {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Student Class Information");
		Student bean = apc.getBean("std", Student.class);
		bean.Display();
		System.out.println("=============================================");
		System.out.println("Department Class Information");
		
		Department bean1 = apc.getBean("dept", Department.class);
		bean1.dept();
		
		System.out.println("=============================================");
		System.out.println("College Class Information");
		
		College bean2 = (College) apc.getBean("clg");
		bean2.info();
	}

}
