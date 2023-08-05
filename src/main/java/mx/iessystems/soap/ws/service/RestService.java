package mx.iessystems.soap.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import mx.iessystems.soap.ws.entity.Saldo;
import mx.iessystems.soap.ws.www.Saldos;

@Service
public class RestService {

    private final WebServiceTemplate wsTemplate;

    @Autowired
    public RestService(WebServiceTemplate webServiceTemplate) {
        this.wsTemplate = webServiceTemplate;
    }

    public mx.iessystems.soap.ws.www.Saldos[] consultaSaldo(Saldo saldo) {
        String soapAction = "ConsultaSaldo";

        mx.iessystems.soap.ws.www.Saldos[] response = (Saldos[]) wsTemplate.marshalSendAndReceive(
                "https://www.calixtaondemand.com/ws/webServiceV10.php",
                saldo,
                new SoapActionCallback(soapAction));
        return response;
    }
}
