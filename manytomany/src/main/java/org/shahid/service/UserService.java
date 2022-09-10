package org.shahid.service;

import lombok.RequiredArgsConstructor;
import org.shahid.converter.UserConverter;
import org.shahid.dto.UserDto;
import org.shahid.entity.User;
import org.shahid.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserConverter converter;

    public List<UserDto> getAllUsers(){
        List<User> users = repository.findAll();
        return converter.mapEntitiesToDtos(repository.findAll());
    }

    public UserDto save(UserDto userDto){
        return converter.mapEntityToDto(repository.save(converter.mapDtoToEntity(userDto)));
    }
}
