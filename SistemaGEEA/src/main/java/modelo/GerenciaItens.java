package modelo;
import java.time.LocalDate;

public class GerenciaItens {
    private static int proximoId = 1;
    private int id;
    private String descricao;
    private int quantidade;
    private boolean status;
    private LocalDate dataDisponivel;

    private static int gerarID() {
        return proximoId++;
    }

    public GerenciaItens() {
        this.id = gerarID();
        this.descricao = null;
        this.quantidade = 0;
        this.status = true;
        this.dataDisponivel = null;
    }

    public GerenciaItens(String descricao, int quantidade, boolean status, LocalDate dataDisponivel) {
        this.id = gerarID();
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setStatus(status);
        this.setDataDisponivel(dataDisponivel);
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
        return "Artefato: \n" + "Descrição = " + descricao + ", quantidade = " + quantidade + ", status = " + status;
    }
}

