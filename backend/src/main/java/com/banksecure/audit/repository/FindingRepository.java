package com.banksecure.audit.repository;
import com.banksecure.audit.model.Finding;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FindingRepository extends JpaRepository<Finding,Long> {}
