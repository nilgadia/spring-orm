package org.shahid.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class Url implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "url_generator")
    @SequenceGenerator(name="url_generator", sequenceName = "url_seq", allocationSize = 1)
    @Column(name = "pk_url_id")
    private int id;
    private String path;
    private String description;

}