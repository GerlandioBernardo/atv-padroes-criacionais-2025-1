package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripeGateway implements  PagamentoGateway{

    private final StripeSDK stripeApi = new StripeSDK();

    @Override
    public void pagar(double valor) {
        stripeApi.realizarPagamento(valor);
    }
}
