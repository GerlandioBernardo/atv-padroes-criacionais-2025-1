package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.dependencyInjection.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.dependencyInjection.PayPalModule;
import br.edu.ifpb.ads.padroes.atv2.dependencyInjection.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        // PayPal
        Injector injector1 = Guice.createInjector(new PayPalModule());
        PagamentoService pagamentoServicePayPal = injector1.getInstance(PagamentoService.class);
        pagamentoServicePayPal.pagar(100);

        // PagSeguro
        Injector injector2 = Guice.createInjector(new PagSeguroModule());
        PagamentoService pagamentoServicePagSeguro = injector2.getInstance(PagamentoService.class);
        pagamentoServicePagSeguro.pagar(200);

        // Stripe
        Injector injector3 = Guice.createInjector(new StripeModule());
        PagamentoService pagamentoServiceStripe = injector3.getInstance(PagamentoService.class);
        pagamentoServiceStripe.pagar(300);

    }
}
