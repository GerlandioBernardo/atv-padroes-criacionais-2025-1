package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoArqueiroElfoFactory implements  AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
