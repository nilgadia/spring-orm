package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Setter
@Getter
public class RolePermissionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private List<PermissionPrivilegeDto> permissionPrevileges;
}