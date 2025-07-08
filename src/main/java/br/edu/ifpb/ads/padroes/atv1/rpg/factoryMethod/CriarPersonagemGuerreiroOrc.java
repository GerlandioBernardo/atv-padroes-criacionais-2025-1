package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoGuerreiroOrcFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemGuerreiroOrc implements  CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoGuerreiroOrcFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Gor")
                .raca("Orc")
                .classe("Guerreiro")
                .forca(20)
                .inteligencia(6)
                .agilidade(8)
                .vida(150)
                .mana(20)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
