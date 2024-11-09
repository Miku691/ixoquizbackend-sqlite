package com.ixoquiz.quiz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	@JsonProperty("uId")
	private String uId;
	
	private String email;
	private String profilePicture;
	private String displayName;
}
