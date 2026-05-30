package com.pratica.crud_springbboot.application.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse<T> {
  private String code;
  private String message;
  private T data;
  private MetaResponse meta;
}
