package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome 
{
	@GetMapping("sh")
	public String Welcomee()
	{
		return "Welcome String Boot!";
	}
}