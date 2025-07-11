package br.edu.ifpb.ads.padroes.atv2.sdk;

public class StripeSDK {
    public  void realizarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " realizado via Stripe.");
    }
}
