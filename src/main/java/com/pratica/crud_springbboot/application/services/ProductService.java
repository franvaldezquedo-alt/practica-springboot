package com.pratica.crud_springbboot.application.services;

import com.pratica.crud_springbboot.application.dto.responses.ProductResponse;
import com.pratica.crud_springbboot.application.ports.in.ProductInputPort;
import com.pratica.crud_springbboot.application.ports.out.ProductRepositoryOutputPort;
import com.pratica.crud_springbboot.infrastructure.utils.ProductMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements ProductInputPort {

  private final ProductRepositoryOutputPort productRepositoryOutputPort;
  private final ProductMapper productMapper;

  public ProductService(ProductRepositoryOutputPort productRepositoryOutputPort, ProductMapper productMapper) {
    this.productRepositoryOutputPort = productRepositoryOutputPort;
    this.productMapper = productMapper;
  }

  @Override
  public List<ProductResponse> getAllProducts() {
    return productRepositoryOutputPort.getAllProducts().stream()
            .map(productMapper::toProductResponse)
            .toList();
  }
}
