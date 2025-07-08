package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoGuerreiroOrcFactory implements  AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }
}
