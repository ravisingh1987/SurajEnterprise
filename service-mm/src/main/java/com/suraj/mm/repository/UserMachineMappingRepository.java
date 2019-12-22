package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.UserMachineMapping;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all UserMachineMapping related DB Query
 */
@Repository
public interface UserMachineMappingRepository extends JpaRepository<UserMachineMapping, Long>{

}



