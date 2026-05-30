package com.pratica.crud_springbboot.infrastructure.utils;

import com.pratica.crud_springbboot.application.dto.responses.ApiResponse;
import com.pratica.crud_springbboot.application.dto.responses.MetaResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductResponse;
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


  public ProductResponse toProductResponse(Product product) {
    return ProductResponse.builder()
          .id(product.getId())
          .nombre(product.getNombre())
          .descripcion(product.getDescripcion())
          .precio(product.getPrecio())
          .stock(product.getStock())
          .categoria(product.getCategoria())
          .fechaCreacion(product.getFechaCreacion())
          .build();
  }

  public ApiResponse<List<ProductResponse>> listProductResponseSuccess(List<ProductResponse> products) {
    return ApiResponse.<List<ProductResponse>>builder()
          .code("200")
          .message(products.isEmpty() ? "No se encontraron productos" : "Productos obtenidos correctamente")
          .data(products)
          .meta(MetaResponse.builder()
                .timestamp(java.time.LocalDateTime.now())
                .totalRecords((long) products.size())
                .limit(products.size())
                .offset(0)
                .build())
          .build();
  }
}
