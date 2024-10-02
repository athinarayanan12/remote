package com.example.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class Controller {

	@GetMapping("/test")
	public String test() {
		return "testOk";
	}
}
