package com.pratica.crud_springbboot.infrastructure.repository;

import com.pratica.crud_springbboot.infrastructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
