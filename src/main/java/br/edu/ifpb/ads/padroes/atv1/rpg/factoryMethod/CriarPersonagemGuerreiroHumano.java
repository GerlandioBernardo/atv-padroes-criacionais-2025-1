package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoGuerreiroHumanoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemGuerreiroHumano implements CreatorPersonagem {

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoGuerreiroHumanoFactory();
    @Override
    public Personagem factoryMethod() {
        return  new PersonagemBuilder()
                .nome("Arthur")
                .raca("Humano")
                .classe("Guerreiro")
                .forca(15)
                .inteligencia(8)
                .agilidade(10)
                .vida(120)
                .mana(30)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
