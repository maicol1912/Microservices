package com.maicol.productrest.Repository;

import com.maicol.productrest.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
