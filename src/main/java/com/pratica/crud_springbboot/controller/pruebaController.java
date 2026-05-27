package com.pratica.crud_springbboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Le dice spring boot esta clase sera un controlador webApi/REST
@RestController


//Define la ruta base del controlador
@RequestMapping("/api/prueba")

public class pruebaController {


  //@GetMapping le dice a spring , este metodo respondera peticiones HTTP GET
  @GetMapping
  public String prueba(){
    return "Hola mundo";
  }
}
