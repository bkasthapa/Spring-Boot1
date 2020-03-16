package com.rab3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.dtos.StudentDto;
import com.rab3.services.StudentServices;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServices studentServices;

//		@PostMapping
//		public void createStudent(@RequestBody StudentDto studentDto) {
//			studentService.createStudentDto(studentDto);
//		}

	@GetMapping(value = "/{id}")
	public StudentDto getStudentById(@PathVariable int id) {
		return studentServices.getDummyDto(id);
	}
}
