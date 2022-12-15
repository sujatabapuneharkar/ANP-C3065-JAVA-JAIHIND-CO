package org.hitech.service;
import java.util.HashMap;

import org.hitech.dao.StudentCourseDAO;
import org.hitech.model.Course;
import org.hitech.model.Student;

public class StudentCourseService {
StudentCourseDAO dao=new StudentCourseDAO();
	
	public void addStudentCourseDetails(Student s,Course c){
		dao.addStudentCourseDetails(s, c);
	}
	
	public HashMap<Student,Course> getStudentCourseDetails() {
		
		return dao.getStudentCourseDetails();
	}
	public void deleteStudentCourseDetails(Student s) {
		dao.deleteStudentCourseDetails(s);
	}
}
