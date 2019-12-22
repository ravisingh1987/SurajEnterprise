package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.MachineCapacityMapping;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all MachineCapacityMapping related DB Query
 */
@Repository
public interface MachineCapacityMappingRepository extends JpaRepository<MachineCapacityMapping, Long>{

}
