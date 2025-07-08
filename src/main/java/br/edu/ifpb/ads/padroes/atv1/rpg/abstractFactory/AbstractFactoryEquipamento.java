package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public interface AbstractFactoryEquipamento {
    Arma criarArma();
    Armadura criarArmadura();
    String[] criarHabilidades();
}
