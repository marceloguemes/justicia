package com.cancun.justicia.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cancun.justicia.service.ExpedienteService;

@RestController
public class ExpedienteController {
    @Autowired
    private ExpedienteService expedienteService;
    
    @RequestMapping("listado")
    public ResponseEntity<List<String>> listado(){
    	return ResponseEntity.ok(expedienteService.listado());
    }
}
