package com.example.demo.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController {

	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
		return "/intro.html";
	}
}
