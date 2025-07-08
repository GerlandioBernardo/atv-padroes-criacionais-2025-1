package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoArqueiroHumanoFactory implements AbstractFactoryEquipamento {

    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}
