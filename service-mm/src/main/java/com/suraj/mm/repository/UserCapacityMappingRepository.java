package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Capacity;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all UserCapacityMapping related DB Query
 */
@Repository
public interface UserCapacityMappingRepository extends JpaRepository<Capacity, Long>{

}
