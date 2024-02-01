package com.dener.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dener.userdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	

}
