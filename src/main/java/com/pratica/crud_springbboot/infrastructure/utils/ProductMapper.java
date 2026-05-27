package com.pratica.crud_springbboot.infrastructure.utils;

import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import com.pratica.crud_springbboot.domain.model.Product;
import com.pratica.crud_springbboot.infrastructure.entity.ProductEntity;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductMapper {

  public ProductEntity toEntity(Product product) {
    ProductEntity entity = new ProductEntity();
    entity.setId(product.getId());
    entity.setNombre(product.getNombre());
    entity.setDescripcion(product.getDescripcion());
    entity.setPrecio(product.getPrecio());
    entity.setStock(product.getStock());
    entity.setCategoria(product.getCategoria());
    entity.setFechaCreacion(product.getFechaCreacion());
    return entity;
  }

  public Product toDomain(ProductEntity entity) {
    Product product = new Product();
    product.setId(entity.getId());
    product.setNombre(entity.getNombre());
    product.setDescripcion(entity.getDescripcion());
    product.setPrecio(entity.getPrecio());
    product.setStock(entity.getStock());
    product.setCategoria(entity.getCategoria());
    product.setFechaCreacion(entity.getFechaCreacion());
    return product;
  }

  public ProductListResponse toProductListResponse (Product product) {
    ProductListResponse response = new ProductListResponse();
    return ProductListResponse.builder()
            .data(List.of(product))
            .error(null)
            .build();
  }

}
