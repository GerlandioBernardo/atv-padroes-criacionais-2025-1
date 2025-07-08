package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoArqueiroHumanoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemArqueiroHumano implements  CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoArqueiroHumanoFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Robin")
                .raca("Humano")
                .classe("Arqueiro")
                .forca(10)
                .inteligencia(12)
                .agilidade(16)
                .vida(100)
                .mana(70)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
