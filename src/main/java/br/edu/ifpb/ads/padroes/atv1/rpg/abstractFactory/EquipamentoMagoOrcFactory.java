package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoMagoOrcFactory implements  AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return  new Arma("Cajado Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia Sombria", "Invocação"};
    }
}
