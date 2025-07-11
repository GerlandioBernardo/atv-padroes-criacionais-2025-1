package br.edu.ifpb.ads.padroes.atv2.service;

import br.edu.ifpb.ads.padroes.atv2.gateways.PagamentoGateway;

import javax.inject.Inject;

public class PagamentoService {

    private  final PagamentoGateway pagamentoGateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway){
        this.pagamentoGateway = gateway;
    }

    public  void pagar(double valor){
        pagamentoGateway.pagar(valor);
    }

}
