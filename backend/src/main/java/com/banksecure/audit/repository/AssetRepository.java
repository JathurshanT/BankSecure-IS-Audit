package com.banksecure.audit.repository;
import com.banksecure.audit.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AssetRepository extends JpaRepository<Asset,Long> {}
