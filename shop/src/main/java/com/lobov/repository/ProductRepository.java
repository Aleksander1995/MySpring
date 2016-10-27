package com.lobov.repository;

import com.lobov.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by alex1_000 on 28.10.2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
}
