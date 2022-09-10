package org.shahid.converter;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.shahid.dto.UserRoleDto;
import org.shahid.entity.UserRole;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserRoleConverter {
    UserRoleDto mapEntityToDto(final UserRole entity);
    List<UserRoleDto> mapEntitiesToDtos(final List<UserRole> entities);
}
