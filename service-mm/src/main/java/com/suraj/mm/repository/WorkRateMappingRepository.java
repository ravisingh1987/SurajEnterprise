package com.suraj.mm.repository;
/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all WorkRateMapping related DB Query
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRateMappingRepository extends JpaRepository<Object, Long>{

}
