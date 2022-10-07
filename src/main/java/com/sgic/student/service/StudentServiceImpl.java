package com.sgic.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.student.entities.Student;
import com.sgic.student.repositories.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository studentRepository;

@Override
public void saveStudent(Student student) {
	
	studentRepository.save(student);
}
@Override
public StudentDto getStudentById(Long id) {
	
	Student student=studentRepository.findById(id).get();
	StudentDto studentDto=new StudentDto();
	studentDto.setId(student.getId());
	studentDto.setFirstName(student.getFirstName());
	studentDto.setLastName(student.getLastName());
	studentDto.setEmail(student.getEmail());
	
	return studentDto;
	
}

}
