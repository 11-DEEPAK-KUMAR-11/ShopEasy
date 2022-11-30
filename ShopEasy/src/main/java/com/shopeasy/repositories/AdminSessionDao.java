package com.shopeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopeasy.models.CurrentAdminSession;

public interface AdminSessionDao extends JpaRepository<CurrentAdminSession, Integer> {

	public CurrentAdminSession findByUuid(String uuid);
}
