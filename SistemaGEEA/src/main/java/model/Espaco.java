package main.java.model;
import java.time.LocalDate;

public class Espaco extends GerenciaItens {
    private boolean reforma;
    private int capacidade;

    public Espaco() {
        super();
        this.setReforma(false);
        this.setCapacidade(0);
    }

    public Espaco(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, int capacidade, boolean reforma) {
        super(descricao, quantidade, status, dataDisponivel, observacoes);
        this.setReforma(reforma);
        this.setCapacidade(capacidade);
    }

    public boolean isReforma() {
        return reforma;
    }

    public void setReforma(boolean reforma) {
        this.reforma = reforma;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade != 0) {
            this.capacidade = capacidade;
        }
    }


    public void realizarReforma() {
        /* Método para realizar alguma reforma no espaço, atualizando o atributo reforma para true ou false */
    }

    @Override
    public String toString() {
        return "Espaco{" + super.toString() + "reforma=" + reforma + ", capacidade=" + capacidade + '}';
    }
}

