package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Work;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all user related DB Query
 */
@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {

}
