package com.sgic.student.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.student.entities.Student;
import com.sgic.student.service.StudentDto;
import com.sgic.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public ResponseEntity<Object> createIncomingSample(@RequestBody Student student) {
//		Student student = new Student();
//		student.setId(studentDto.getId());
//		student.setFirstName(studentDto.getFirstName());
//		student.setLastName(studentDto.getLastName());
//		student.setEmail(studentDto.getEmail());
		
		studentService.saveStudent(student);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	
@RequestMapping("/hello")
	public Map<String, String> callAsyncMethod() {
		Map map = new HashMap<Integer, String>();
		map.put("message", "Hello");

		map.put("message1", "Hello-world");
		return map; // returns empty braces
	}

@GetMapping("/student/{id}")
public ResponseEntity<Object> getStudentById(@PathVariable Long id) {

	return ResponseEntity.ok(studentService.getStudentById(id));
}


}
