package com.feingteste.testefeig.controller;

import com.feingteste.testefeig.config.IOpenFeigNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numeros")
public class ListaDados {

    @Autowired
    IOpenFeigNumber openFeigNumber;

    @RequestMapping(value = "/{id}")
    public String mostraNumero(@PathVariable int id){
        return openFeigNumber.buscaDadoNumero(id);
    }
    @RequestMapping
    public String mostraNumeroDefault(){
        return openFeigNumber.buscaDadoNumero(1);
    }

}
