package org.shahid.converter;

import org.mapstruct.Mapper;
import org.shahid.dto.UrlDto;
import org.shahid.entity.Url;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UrlConverter {
    UrlDto mapEntityToDto(final Url entity);
    List<UrlDto> mapEntitiesToDtos(final List<Url> entities);

}
