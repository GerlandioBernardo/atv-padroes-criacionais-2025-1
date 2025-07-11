package br.edu.ifpb.ads.padroes.atv2.dependencyInjection;

import br.edu.ifpb.ads.padroes.atv2.gateways.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.gateways.PagamentoGateway;
import com.google.inject.AbstractModule;

public class PagSeguroModule extends AbstractModule {

    @Override
    protected  void configure(){
        bind(PagamentoGateway.class).to(PagSeguroGateway.class);
    }
}
