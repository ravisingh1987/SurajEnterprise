package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.UnitMaster;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all user related DB Query
 */
@Service
public interface UnitMasterRepository extends JpaRepository<UnitMaster, Long> {

}
