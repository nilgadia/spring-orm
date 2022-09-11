package org.shahid.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.RolePermissionDto;
import org.shahid.entity.RolePermission;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RolePermissionConverter {

    @Mapping(source = "url.path", target = "path")
    RolePermissionDto mapEntityToDto(final RolePermission entity);
    List<RolePermissionDto> mapEntitiesToDtos(final List<RolePermission> entities);
}
