package com.eldritchkeys.Repository;

import com.eldritchkeys.Model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {
}
