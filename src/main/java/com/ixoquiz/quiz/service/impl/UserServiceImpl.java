package com.ixoquiz.quiz.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixoquiz.quiz.dto.UserDto;
import com.ixoquiz.quiz.entity.User;
import com.ixoquiz.quiz.repo.UserRepo;
import com.ixoquiz.quiz.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public UserDto saveUserInfo(UserDto userDto) {
		User savedUserData = this.userRepo.save(this.modelMapper.map(userDto, User.class));
		return this.modelMapper.map(savedUserData, UserDto.class);
	}

	@Override
	public UserDto getUserDetailsById(String userId) {
		return this.modelMapper.map(this.userRepo.findById(userId), UserDto.class);
	}

}
