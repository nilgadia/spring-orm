package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class RoleDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private List<RolePermissionDto> rolePermissions;
}