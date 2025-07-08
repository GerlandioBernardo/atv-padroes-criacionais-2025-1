package br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class EquipamentoGuerreiroElfoFactory implements AbstractFactoryEquipamento{
    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }
}
