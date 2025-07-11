package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalGateway implements  PagamentoGateway{

    private  final PayPalSDK payPalApi = new PayPalSDK();
    @Override
    public void pagar(double valor) {
        payPalApi.realizarPagamento(valor);
    }
}
