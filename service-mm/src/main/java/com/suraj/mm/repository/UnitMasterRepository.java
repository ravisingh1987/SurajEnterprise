package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.UnitMaster;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all UnitMaster related DB Query
 */
@Repository
public interface UnitMasterRepository extends JpaRepository<UnitMaster, Long> {

}
