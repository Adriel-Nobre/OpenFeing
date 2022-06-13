package com.feingteste.testefeig.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "number-consumer", url = "http://numbersapi.com/")
public interface IOpenFeigNumber {

    @GetMapping(value = "/{id}")
    public String buscaDadoNumero(@PathVariable int id);

}
