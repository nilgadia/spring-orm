package org.shahid.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.PermissionPrivilegeDto;
import org.shahid.entity.PermissionPrivilege;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionPrivilegeConverter {

    PermissionPrivilegeDto mapEntityToDto(final PermissionPrivilege entity);
    List<PermissionPrivilegeDto> mapEntitiesToDtos(final List<PermissionPrivilege> entities);
}
