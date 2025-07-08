package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethod.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;

public class Main {
    public static void main(String[] args) {
        CreatorPersonagem[] creatorPersonagems = {
                new CriarPersonagemGuerreiroHumano(),
                new CriarPersonagemGuerreiroElfo(),
                new CriarPersonagemGuerreiroOrc(),

                new CriarPersonagemMagoHumano(),
                new CriarPersonagemMagoElfo(),
                new CriarPersonagemMagoOrc(),

                new CriarPersonagemArqueiroHumano(),
                new CriarPersonagemArqueiroElfo(),
                new CriarPersonagemArqueiroOrc()
        };

        System.out.println("===== Personagens Criados =====");
        for (CreatorPersonagem creatorPersonagem: creatorPersonagems){
            Personagem personagem = creatorPersonagem.factoryMethod();

            System.out.println(personagem);


            System.out.println("Arma: " + personagem.getArma().getNome() + " | Dano: " +
                    personagem.getArma().getDano() + " | Tipo: " + personagem.getArma().getTipo());
            System.out.println("Armadura: " + personagem.getArmadura().getNome() + " | Defesa: " +
                    personagem.getArmadura().getDefesa() + " | Tipo: " + personagem.getArmadura().getTipo());

            System.out.print("Habilidades: ");
            for (String habilidade : personagem.getHabilidades()) {
                System.out.print(habilidade + "  ");
            }
            System.out.println("\n---------------------------");
        }
    }
}
