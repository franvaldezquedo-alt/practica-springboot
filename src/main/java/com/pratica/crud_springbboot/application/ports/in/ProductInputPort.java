package com.pratica.crud_springbboot.application.ports.in;

import com.pratica.crud_springbboot.application.dto.responses.ApiResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductListResponse;
import com.pratica.crud_springbboot.application.dto.responses.ProductResponse;
import java.util.List;


public interface ProductInputPort {
  List<ProductResponse> getAllProducts();
}
