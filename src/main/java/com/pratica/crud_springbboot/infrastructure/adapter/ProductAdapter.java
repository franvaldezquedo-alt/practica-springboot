package com.pratica.crud_springbboot.infrastructure.adapter;

import com.pratica.crud_springbboot.application.ports.out.ProductRepositoryOutputPort;
import com.pratica.crud_springbboot.domain.model.Product;
import com.pratica.crud_springbboot.infrastructure.repository.ProductRepository;
import com.pratica.crud_springbboot.infrastructure.utils.ProductMapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductAdapter implements ProductRepositoryOutputPort {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductAdapter(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll().stream()
            .map(productMapper::toDomain)
            .toList();
  }
}
