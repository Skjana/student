package com.sgic.student.service;

import com.sgic.student.entities.Student;

public interface StudentService {

	void saveStudent(Student student );
	
	StudentDto getStudentById(Long id);
	
}
