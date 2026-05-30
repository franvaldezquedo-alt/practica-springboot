package com.pratica.crud_springbboot.application.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MetaResponse {
  private LocalDateTime timestamp;
  private Long totalRecords;
  private Integer limit;
  private Integer offset;
}
