package com.upiiz.security.memory.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class FacturasController {
    @GetMapping("/listar")
    public String listar() {
        return "Listado de factutas - con seguridad";
    }

    @PostMapping("/agregar")
    public String agregar() {
        return "Factura agregada - con seguridad";
    }

    @PutMapping("/actualizar")
    public String actualizar() {
        return "Factura actualizada - con seguridad";
    }

    @DeleteMapping("/eliminar")
    public String eliminar() {
        return "Factura eliminada - con seguridad";
    }
}
