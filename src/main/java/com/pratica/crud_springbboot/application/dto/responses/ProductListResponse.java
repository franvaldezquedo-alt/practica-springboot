package com.pratica.crud_springbboot.application.dto.responses;

import com.pratica.crud_springbboot.domain.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductListResponse {
  List<Product> data;
  String error;
}
