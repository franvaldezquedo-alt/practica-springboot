package com.pratica.crud_springbboot.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class pruebaController {

  @GetMapping
  public String prueba(){
    return "Hola mundo";
  }
}
