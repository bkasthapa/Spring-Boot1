package com.rab3.services;

import org.springframework.stereotype.Service;

import com.rab3.dtos.StudentDto;

@Service
public class StudentServices {

	public StudentDto getDummyDto(int id) {
		StudentDto dto = new StudentDto();
		dto.setName("Bikash Thapa");
		dto.setAddress("9335 Lee Highway");
		dto.setEmailAddress("bksthapa@yahoo.com");
		dto.setRollNumber(11);
		dto.setStudentId("1A");
		return dto;

	}
}

//	public void createStudent() {
//		
//		StudentDto studentDto= new StudentDto();
//		studentDto.setName(");
//		
//	}
//}
