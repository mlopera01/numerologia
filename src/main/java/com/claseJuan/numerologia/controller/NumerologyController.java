package com.claseJuan.numerologia.controller;

import com.claseJuan.numerologia.dto.NameNumerology;
import com.claseJuan.numerologia.service.NumerologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/name" )

public class NumerologyController {
    private final NumerologyService numerologyService;

    public NumerologyController(@Autowired NumerologyService ns) {
        this.numerologyService = ns;
    }
    @PostMapping
    public ResponseEntity<NameNumerology> solucion (@RequestBody String name){
        return ResponseEntity.ok(numerologyService.calculate(name));
    }
}
