package com.pratica.crud_springbboot.application.ports.in;

import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import java.util.List;

public interface ProductInputPort {
  ProductListResponse getAllProducts();
}
