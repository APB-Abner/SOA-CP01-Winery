package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineWarningService", targetNamespace = "http://winery.fiap.com.br/")
public class WineWarningServiceImplementacion implements WineWarningService {

    @Override
    public String sendWarn() {
        return "Estoque insuficiente!";
    }
}
