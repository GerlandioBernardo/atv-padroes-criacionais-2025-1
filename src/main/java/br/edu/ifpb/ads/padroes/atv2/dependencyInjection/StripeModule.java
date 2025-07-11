package br.edu.ifpb.ads.padroes.atv2.dependencyInjection;

import br.edu.ifpb.ads.padroes.atv2.gateways.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateways.StripeGateway;
import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {

    @Override
    protected  void configure(){
        bind(PagamentoGateway.class).to(StripeGateway.class);
    }
}
