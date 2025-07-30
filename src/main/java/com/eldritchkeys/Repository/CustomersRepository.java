package com.eldritchkeys.Repository;

import com.eldritchkeys.Model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
}
