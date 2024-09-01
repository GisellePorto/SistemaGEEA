package model;

public class Espaco {
    private String nome;
    private boolean disponibilidade;
    private int numSerie;

    public Espaco(String nome, boolean disponibilidade){
        setNome(nome);
        setDisponibilidade(disponibilidade);
    }

    private void setDisponibilidade(boolean disponibilidade) {

    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

}