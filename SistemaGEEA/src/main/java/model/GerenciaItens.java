package main.java.model;
import java.time.LocalDate;

public class GerenciaItens {
    private static int proximoId = 1;
    private int id;
    private String descricao;
    private int quantidade;
    private boolean status;
    private LocalDate dataDisponivel;
    private String observacoes;

    private static int gerarID() {
        return proximoId++;
    }

    public GerenciaItens() {
        this.id = gerarID();
        this.descricao = null;
        this.quantidade = 0;
        this.status = true;
        this.dataDisponivel = null;
        this.observacoes = null;
    }

    public GerenciaItens(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes) {
        this.id = gerarID();
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setStatus(status);
        this.setDataDisponivel(dataDisponivel);
        this.setObservacoes(observacoes);
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null){
            this.descricao = descricao;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDataReserva() {
        return dataDisponivel;
    }

    public void setDataDisponivel(LocalDate dataDisponivel) {
        if (dataDisponivel != null) {
            this.dataDisponivel = dataDisponivel;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        if(observacoes != null){
            this.observacoes = observacoes;
        }
    }


    public void adicionar() {

    }

    public void remover() {

    }

    public void alterar() {

    }

    public void atualizarStatus() {

    }

    public void verificarDisponibilidade() {

    }

    @Override
    public String toString() {
        return "ItemReservavel{" + "descricao=" + descricao + ", quantidade=" + quantidade + ", status=" + status + ", observacoes=" + observacoes + '}';
    }
}

