package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Priority;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all Priority related DB Query
 */
@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {

}
