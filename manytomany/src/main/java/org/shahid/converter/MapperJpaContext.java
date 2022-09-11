package org.shahid.converter;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.shahid.entity.User;
import org.shahid.entity.UserRole;

import javax.persistence.EntityManager;

public class MapperJpaContext {
	
	@SuppressWarnings("unused")
	private final EntityManager em;
	// Find a work around
	private User user;

	public MapperJpaContext(EntityManager em) {
        this.em = em;
    }
	
	@BeforeMapping
    public void setUser(@MappingTarget User user) {
       this.user = user;
    }

	@AfterMapping
    public void setUserToUserRole(@MappingTarget UserRole userRole) {
        userRole.setUser(user);
    }
}