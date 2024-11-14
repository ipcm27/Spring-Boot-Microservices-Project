package com.devigor.zilla_order.repository;

import com.devigor.zilla_order.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
