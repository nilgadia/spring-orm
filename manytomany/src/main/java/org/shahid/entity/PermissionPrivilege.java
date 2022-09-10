package org.shahid.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class PermissionPrivilege implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_privilege_generator")
    @SequenceGenerator(name="permission_privilege_generator", sequenceName = "permission_privilege_seq", allocationSize = 1)
    @Column(name = "pk_permission_privilege_id")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_role_permission_id")
    private RolePermission rolePermission;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_privilege_id")
    private Privilege privilege;
}