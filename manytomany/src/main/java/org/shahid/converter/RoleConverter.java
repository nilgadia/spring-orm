package org.shahid.converter;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.shahid.dto.RoleDto;
import org.shahid.entity.Role;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleConverter {
    RoleDto mapEntityToDto(final Role entity);
    List<RoleDto> mapEntitiesToDtos(final List<Role> entities);
}
