package com.ixoquiz.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ixoquiz.quiz.dto.UserDto;
import com.ixoquiz.quiz.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<UserDto> saveUserDetails(@RequestBody UserDto userDto){
		return new ResponseEntity<UserDto>(this.userService.saveUserInfo(userDto), HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<UserDto> getUserDetailsById(@PathVariable String userId){
		return new ResponseEntity<UserDto>(this.userService.getUserDetailsById(userId),HttpStatus.OK);
	}
}
