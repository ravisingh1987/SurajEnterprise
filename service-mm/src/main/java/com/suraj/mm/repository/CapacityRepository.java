package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Capacity;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all Capacity related DB Query
 */
@Repository
public interface CapacityRepository extends JpaRepository<Capacity, Long> {

}
