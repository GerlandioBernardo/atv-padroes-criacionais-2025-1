package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoArqueiroElfoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemArqueiroElfo implements  CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoArqueiroElfoFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Legolas")
                .raca("Elfo")
                .classe("Arqueiro")
                .forca(8)
                .inteligencia(16)
                .agilidade(20)
                .vida(90)
                .mana(100)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
