package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoArqueiroOrcFactory implements  AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}
