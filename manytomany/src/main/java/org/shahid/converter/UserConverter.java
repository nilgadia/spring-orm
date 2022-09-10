package org.shahid.converter;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.shahid.dto.UserDto;
import org.shahid.entity.User;

import java.util.List;

@Mapper(componentModel = "spring" ,  uses = {UserRoleConverter.class})
public interface UserConverter {
    UserDto mapEntityToDto(final User entity);
    List<UserDto> mapEntitiesToDtos(final List<User> entities);
}
