package org.shahid.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Setter
@Getter
public class UserRolePk implements Serializable {
    // try with embeddable
    @Column(name = "fk_user_id")
    private int userId;

    @Column(name = "fk_role_id")
    private int roleId;
}
