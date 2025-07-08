package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.AbstractFactoryEquipamento;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractFactory.EquipamentoMagoHumanoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;

public class CriarPersonagemMagoHumano implements  CreatorPersonagem{

    AbstractFactoryEquipamento factoryEquipamento = new EquipamentoMagoHumanoFactory();
    @Override
    public Personagem factoryMethod() {
        return new PersonagemBuilder()
                .nome("Merlin")
                .raca("Humano")
                .classe("Mago")
                .forca(6)
                .inteligencia(18)
                .agilidade(8)
                .vida(80)
                .mana(180)
                .arma(factoryEquipamento.criarArma())
                .armadura(factoryEquipamento.criarArmadura())
                .habilidades(factoryEquipamento.criarHabilidades())
                .builder();
    }
}
