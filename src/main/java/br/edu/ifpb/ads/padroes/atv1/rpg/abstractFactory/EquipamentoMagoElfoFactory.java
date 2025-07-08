package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoMagoElfoFactory implements AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }
}
