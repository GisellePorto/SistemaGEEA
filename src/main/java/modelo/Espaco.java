package modelo;
import java.time.LocalDate;

public class Espaco extends GerenciaItens {
    private boolean emManutencao;
    private int capacidade;

    public Espaco() {
        super();
        this.setEmManutencao(false);
        this.setCapacidade(0);
    }

    public Espaco(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, int capacidade, boolean reforma) {
        super(descricao, quantidade, status, dataDisponivel);
        this.setEmManutencao(reforma);
        this.setCapacidade(capacidade);
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean manutencao) {
        this.emManutencao = manutencao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }


    public void manutencao() {
        if (emManutencao){
            emManutencao = false;
        }else{
            emManutencao = true;
        }
    }

    @Override
    public String toString() {
        return "Espaco: " + super.toString() + "em manutenção =" + emManutencao + ", capacidade =" + capacidade;
    }
}

