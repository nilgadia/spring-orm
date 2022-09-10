package org.shahid.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name="user_generator", sequenceName = "user_seq", allocationSize = 1)
    @Column(name = "pk_user_id")
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(name="TBL_USER_ROLE", joinColumns=@JoinColumn(name="fk_user_id"), inverseJoinColumns=@JoinColumn(name="fk_role_id"))
    private List<Role> roles;
}
