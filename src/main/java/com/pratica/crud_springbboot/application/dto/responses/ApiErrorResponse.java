package com.pratica.crud_springbboot.application.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiErrorResponse {
  private String code;
  private String message;
  private ErrorResponse error;
  private MetaResponse meta;
}
