package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoGuerreiroElfoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemGuerreiroElfo implements CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoGuerreiroElfoFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Faelar")
                .raca("Elfo")
                .classe("Guerreiro")
                .forca(12)
                .inteligencia(14)
                .agilidade(16)
                .vida(100)
                .mana(60)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();

    }
}
