package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.MachinePriorityMapping;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all MachinePriorityMapping related DB Query
 */
@Repository
public interface MachinePriorityMappingRepository extends JpaRepository<MachinePriorityMapping, Long>{

}
