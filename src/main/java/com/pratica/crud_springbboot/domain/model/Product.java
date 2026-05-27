package com.pratica.crud_springbboot.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
  private Long id;
  private String nombre;
  private String descripcion;
  private BigDecimal precio;
  private Integer stock;
  private String categoria;
  private LocalDateTime fechaCreacion;
}
