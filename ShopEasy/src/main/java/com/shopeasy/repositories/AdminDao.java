package com.shopeasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopeasy.models.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

	Admin findByAdminId(Integer adminId);

}
