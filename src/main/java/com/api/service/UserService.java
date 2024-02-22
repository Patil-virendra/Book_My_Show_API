package com.api.service;

import com.api.payloads.UserDto;

public interface UserService {
    UserDto register(UserDto userDto);
    String login(String email,String password);
    UserDto updateProfile(UserDto userDto, String userId);
}
