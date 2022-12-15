package org.hitech.view;
import java.util.Scanner;

import org.hitech.dao.StudentCourseDAO;
import org.hitech.model.Course;
import org.hitech.model.Student;

public class StudentCourseView {
public static void main(String[] args) {
		
		StudentCourseDAO service=new StudentCourseDAO();
		Scanner sc=new Scanner(System.in);
		
		Student s;
		Course c;
		for(int i=1;i<=5;i++) {
			service.addStudentCourseDetails(s,c);
			System.out.println("Enter Student Id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter Student qualification:");
			String qual=sc.next();
			sc.nextLine();
		}
		
	}


}
