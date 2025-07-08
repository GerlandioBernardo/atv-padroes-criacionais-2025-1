package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoArqueiroOrcFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemArqueiroOrc implements  CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoArqueiroOrcFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Zarg")
                .raca("Orc")
                .classe("Arqueiro")
                .forca(14)
                .inteligencia(8)
                .agilidade(12)
                .vida(120)
                .mana(40)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
