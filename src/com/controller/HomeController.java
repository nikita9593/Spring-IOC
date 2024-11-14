package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Entity.College;
import com.Entity.Department;
import com.Entity.Student;

public class HomeController {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beans.xml");

		BeanFactory bf = new XmlBeanFactory(resource);

		Student student = (Student) bf.getBean("std");
		System.out.println("Student Class Information");
		student.Display();
		System.out.println("===============================================");
		
		Department department = (Department) bf.getBean("dept");

		System.out.println("Departent Class Information");
		department.dept();

		System.out.println("===============================================");
		System.out.println("College Class Information");
		
		College college = (College) bf.getBean("clg");
		college.info();

	}

}