package org.shahid.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "privilege_generator")
    @SequenceGenerator(name="privilege_generator", sequenceName = "privilege_seq", allocationSize = 1)
    @Column(name = "pk_privilege_id")
    private int id;
    private String code;
    private String description;
}