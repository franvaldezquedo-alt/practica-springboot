package com.pratica.crud_springbboot.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "productos")
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", nullable = false, length = 100)
  private String nombre;

  @Column(name = "descripcion", length = 255)
  private String descripcion;

  @Column(name = "precio", nullable = false, precision = 10, scale = 2)
  private BigDecimal precio;

  @Column(name = "stock", nullable = false)
  private Integer stock;

  @Column(name = "categoria", length = 50)
  private String categoria;

  @Column(name = "fecha_creacion", nullable = false)
  private LocalDateTime fechaCreacion;
}
