package com.api.controllers;

import com.api.payloads.UserDto;
import com.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> userRegistration(@RequestBody UserDto userDto)
    {
        UserDto register = this.userService.register(userDto);

        return new ResponseEntity<>(register, HttpStatus.CREATED);
    }
    @PutMapping("/update/{userId}")
    public ResponseEntity<UserDto> updateProfile(@RequestBody UserDto userDto, @PathVariable String userId)
    {
        UserDto userDto1 = this.userService.updateProfile(userDto, userId);

        return new ResponseEntity<>(userDto1,HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<String> login(@RequestParam String email,@RequestParam String password)
//    {
//        String login = this.userService.login(email, password);
//        return new ResponseEntity<>(login,HttpStatus.OK);
//    }


}


