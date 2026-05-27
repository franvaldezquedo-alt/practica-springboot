package com.pratica.crud_springbboot.infrastructure.controller;

import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import com.pratica.crud_springbboot.application.ports.in.ProductInputPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class ProductController {

  private final ProductInputPort productInputPort;

  public ProductController(ProductInputPort productInputPort) {
    this.productInputPort = productInputPort;
  }

 @GetMapping("/products")
  public ProductListResponse getAllProducts() {
    return productInputPort.getAllProducts();
  }
}
