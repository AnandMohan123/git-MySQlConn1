package com.mySqlConn.db.repository;

import com.mySqlConn.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
}
