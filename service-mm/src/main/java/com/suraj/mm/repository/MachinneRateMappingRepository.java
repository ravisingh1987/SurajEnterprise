package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Rate;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all MachinneRateMapping related DB Query
 */
@Repository
public interface MachinneRateMappingRepository extends JpaRepository<Rate, Long>{

}
