package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PermissionPrivilegeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private PrivilegeDto privilege;
}