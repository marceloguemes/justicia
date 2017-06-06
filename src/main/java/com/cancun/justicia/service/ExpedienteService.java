package com.cancun.justicia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class ExpedienteService {

    public List<String> listado(){
    	List<String> expedientes = Lists.newArrayList();
    	expedientes.add("Marcelo 1");
    	expedientes.add("Marcelo 2");
    	expedientes.add("Marcelo 3");
    	return expedientes;
    }
}
