package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registeration")
	public String registeration() {
		return "registeration";
	}
	
	@GetMapping("/newSong")
	public String newSong() {
		return "newSong";
	}
	
	@GetMapping("/adminHome")
	public String adminHome() {
		return "adminHome";
	}
	
	
}