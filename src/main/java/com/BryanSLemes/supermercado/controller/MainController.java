package com.BryanSLemes.supermercado.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Supermercado")
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> logarUsuario() {
        return new ResponseEntity<>("EndPoint funcionando", HttpStatus.OK);
    }
}
