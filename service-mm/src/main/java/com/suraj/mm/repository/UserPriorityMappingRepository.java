package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all UserPriorityMapping related DB Query
 */
@Repository
public interface UserPriorityMappingRepository extends JpaRepository<Object, Long>{

}
