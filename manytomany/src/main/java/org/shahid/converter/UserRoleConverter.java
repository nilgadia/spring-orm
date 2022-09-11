package org.shahid.converter;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.RoleDto;
import org.shahid.entity.Role;
import org.shahid.entity.UserRole;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RolePermissionConverter.class})
public interface UserRoleConverter {

    @Mapping(source = "role.name", target = "name")
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "role.rolePermissions", target = "rolePermissions")
    RoleDto mapEntityToDto(final UserRole entity);
    List<Role> mapEntitiesToDtos(final List<UserRole> entity);

    @Mapping(source = "id", target = "role.id")
    @Mapping(target = "id", ignore = true)
    UserRole mapDtoToEntity(final RoleDto dto, @Context MapperJpaContext ctx);
    List<UserRole> mapDtosToEntities(final List<RoleDto> dto, @Context MapperJpaContext ctx);
}
