package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.CurrentUserSession;

public interface CurrentSessionRepo extends JpaRepository<CurrentUserSession, String> {
	public CurrentUserSession findByUserName(String string);
}
