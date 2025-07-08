package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {
    private  static  ConfiguracaoJogo instancia;
    private int nivelDificuldade;

    public ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public  static ConfiguracaoJogo getInstance(){
        if (instancia == null){
            instancia = new ConfiguracaoJogo();
        }
        return  instancia;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
