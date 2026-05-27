package com.pratica.crud_springbboot.application.services;

import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
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
  public ProductListResponse getAllProducts() {
    return productRepositoryOutputPort.getAllProducts().stream()
            .map(productMapper::toProductListResponse )
            .findFirst()
            .orElse(ProductListResponse.builder()
                    .data(List.of())
                    .error("No se encontraron productos")
                    .build());
  }
}
