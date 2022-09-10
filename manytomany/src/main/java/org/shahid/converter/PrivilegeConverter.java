package org.shahid.converter;

import org.mapstruct.Mapper;
import org.shahid.dto.PrivilegeDto;
import org.shahid.entity.Privilege;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PrivilegeConverter {
    PrivilegeDto mapEntityToDto(final Privilege entity);
    List<PrivilegeDto> mapEntitiesToDtos(final List<Privilege> entities);
}
