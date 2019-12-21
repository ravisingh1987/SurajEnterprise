package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Rate;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all RateUnitmasterMapping related DB Query
 */
@Repository
public interface RateUnitmasterMappingRepository extends JpaRepository<Rate, Long>{

}
