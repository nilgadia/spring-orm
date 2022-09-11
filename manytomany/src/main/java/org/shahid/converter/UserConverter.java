package org.shahid.converter;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.UserDto;
import org.shahid.entity.User;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserRoleConverter.class})
public interface UserConverter {
    @Mapping(source = "userRoles", target = "roles")
    @Mapping(target = "id", ignore = true)
    UserDto mapEntityToDto(final User entity);
    List<UserDto> mapEntitiesToDtos(final List<User> entities);
    @Mapping(source = "roles", target = "userRoles")
    User mapDtoToEntity(final UserDto dto, @Context MapperJpaContext ctx);
}
