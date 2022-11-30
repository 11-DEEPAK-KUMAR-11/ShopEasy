package com.shopeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopeasy.models.CurrentCustomerSession;

public interface CustomerSessionDao extends JpaRepository<CurrentCustomerSession, Integer> {

	public CurrentCustomerSession findByUuid(String uuid);
}
