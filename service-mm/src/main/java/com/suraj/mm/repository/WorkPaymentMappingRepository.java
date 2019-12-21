package com.suraj.mm.repository;
/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all WorkPaymentMapping related DB Query
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Payment;

@Repository
public interface WorkPaymentMappingRepository extends JpaRepository<Payment, Long>{

}
