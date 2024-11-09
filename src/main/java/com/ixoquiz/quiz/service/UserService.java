package com.ixoquiz.quiz.service;

import com.ixoquiz.quiz.dto.UserDto;

public interface UserService {
	UserDto saveUserInfo(UserDto userDto);
	UserDto getUserDetailsById(String userId);
}
