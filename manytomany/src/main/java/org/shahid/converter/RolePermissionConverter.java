package org.shahid.converter;

import org.mapstruct.Mapper;
import org.shahid.dto.RolePermissionDto;
import org.shahid.entity.RolePermission;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RolePermissionConverter {
    RolePermissionDto mapEntityToDto(final RolePermission entity);
    List<RolePermissionDto> mapEntitiesToDtos(final List<RolePermission> entities);
}
