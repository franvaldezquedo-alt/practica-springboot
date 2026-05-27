package com.pratica.crud_springbboot.application.ports.out;

import com.pratica.crud_springbboot.domain.model.Product;
import java.util.List;

public interface ProductRepositoryOutputPort {
  List<Product> getAllProducts();
}
