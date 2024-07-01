package com.example.demo.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class TestRestController {
	@PostMapping("/submit")
    public ResponseEntity<String> submitMessage(@RequestParam("message") String message) {
        
		System.out.println("test");
		// 메시지 처리 로직
        return ResponseEntity.ok("Received message: " + message);
    }
}
