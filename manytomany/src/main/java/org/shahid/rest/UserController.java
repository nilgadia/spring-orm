package org.shahid.rest;

import lombok.RequiredArgsConstructor;
import org.shahid.dto.UserDto;
import org.shahid.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService service;

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(this.service.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        return new ResponseEntity<>(this.service.save(user), HttpStatus.OK);
    }
}
