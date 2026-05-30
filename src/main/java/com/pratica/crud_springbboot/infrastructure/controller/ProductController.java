package com.pratica.crud_springbboot.infrastructure.controller;

import com.pratica.crud_springbboot.application.dto.responses.ApiResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductResponse;
import com.pratica.crud_springbboot.application.ports.in.ProductInputPort;
import com.pratica.crud_springbboot.infrastructure.utils.ProductMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/prueba")
public class ProductController {

  private final ProductInputPort productInputPort;
  private final ProductMapper productMapper;

  public ProductController(ProductInputPort productInputPort, ProductMapper productMapper) {
    this.productInputPort = productInputPort;
    this.productMapper = productMapper;
  }

 @GetMapping("/products")
  public ApiResponse<List<ProductResponse>> getAllProducts() {
    List<ProductResponse> products = productInputPort.getAllProducts();
    return productMapper.listProductResponseSuccess(products);
  }
}
