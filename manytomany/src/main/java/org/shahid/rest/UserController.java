package org.shahid.rest;

import lombok.RequiredArgsConstructor;
import org.shahid.dto.UserDto;
import org.shahid.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService service;

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllQueries() {
        return new ResponseEntity<>(this.service.getAllUsers(), HttpStatus.OK);
    }
}
