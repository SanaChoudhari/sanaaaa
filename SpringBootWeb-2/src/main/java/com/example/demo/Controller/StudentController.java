package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@GetMapping("/create")
	public String createStudent() {
		return "createStudent";
	}
	@GetMapping("/read")
	public String readStudent() {
		return "readStudent";
	}
	@GetMapping("/update")
	public String updateStudent() {
		return "updateStudent";
	}
	@GetMapping("/Delete")
	public String delStudent() {
		return "delStudent";
	}

}
