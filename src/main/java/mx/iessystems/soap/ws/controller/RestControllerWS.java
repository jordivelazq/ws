package mx.iessystems.soap.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.iessystems.soap.ws.entity.Saldo;
import mx.iessystems.soap.ws.service.RestService;

@RestController
@RequestMapping("/api")
public class RestControllerWS {

    private final RestService restService;

    @Autowired
    public RestControllerWS(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/saldo")
    public mx.iessystems.soap.ws.www.Saldos[] consultaSaldo(@RequestBody Saldo saldo) {
        return this.restService.consultaSaldo(saldo);
    }

}
