package com.alexspring.alexboot;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class Studentservice {
 
    public List<student> getStudents() {
		return List.of(
			new student(
				"Alex",
				LocalDate.of(2000, Month.JANUARY, 5),
				"aleximani201@gmail.com",
				21
			)
		);
	}

}
