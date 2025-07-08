package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Personagem;

public class PersonagemBuilder implements BuilderPersonagem {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    @Override
    public BuilderPersonagem nome(String nome) {
        this.nome = nome;
        return  this;
    }

    @Override
    public BuilderPersonagem raca(String raca) {
        this.raca = raca;
        return this;
    }

    @Override
    public BuilderPersonagem classe(String classe) {
        this.classe = classe;
        return this;
    }

    @Override
    public BuilderPersonagem forca(int forca) {
        this.forca = forca;
        return this;
    }

    @Override
    public BuilderPersonagem inteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return  this;
    }

    @Override
    public BuilderPersonagem agilidade(int agilidade) {
        this.agilidade = agilidade;
        return this;
    }

    @Override
    public BuilderPersonagem vida(int vida) {
        this.vida = vida;
        return this;
    }

    @Override
    public BuilderPersonagem mana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public BuilderPersonagem arma(Arma arma) {
        this.arma = arma;
        return this;
    }

    @Override
    public BuilderPersonagem armadura(Armadura armadura) {
        this.armadura = armadura;
        return this;
    }

    @Override
    public BuilderPersonagem habilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    @Override
    public Personagem builder() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade,
                vida, mana, arma, armadura, habilidades);
    }
}
