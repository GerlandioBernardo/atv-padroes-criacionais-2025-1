package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;

public interface BuilderPersonagem {

    BuilderPersonagem nome(String nome);
    BuilderPersonagem raca(String raca);
    BuilderPersonagem classe(String classe);
    BuilderPersonagem forca(int forca);
    BuilderPersonagem inteligencia(int inteligencia);
    BuilderPersonagem agilidade(int agilidade);
    BuilderPersonagem vida(int vida);
    BuilderPersonagem mana(int mana);
    BuilderPersonagem arma(Arma arma);
    BuilderPersonagem armadura(Armadura armadura);
    BuilderPersonagem habilidades(String[] habilidades);
    Personagem builder();


}
