package br.edu.ifpb.ads.padroes.atv2.gateways;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;

public class PagSeguroGateway implements  PagamentoGateway {
    private final PagSeguroSDK pagSeguroApi = new PagSeguroSDK();
    @Override
    public void pagar(double valor) {
        pagSeguroApi.realizarPagamento(valor);
    }
}
