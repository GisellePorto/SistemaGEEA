package modelo;

import java.time.LocalDate;

public class Equipamento extends GerenciaItens {
    private String fabricante;
    private String modelo;
    private boolean emManutencao;

    public Equipamento() {
        super();
        this.setFabricante(null);
        this.setModelo(null);
        this.setManutencao(false);
    }

    public Equipamento(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, String fabricante, String modelo, boolean manutencao) {
        super(descricao, quantidade, status, dataDisponivel);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setManutencao(manutencao);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null) {
            this.fabricante = fabricante;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.emManutencao = manutencao;
    }

    public void realizarManutencao() {
    }

    public void finalizarManutencao() {
    }


    @Override
    public String toString() {
        return "Equipamento:" + super.toString() + ", marca=" + ", fabricante="
                + fabricante + ", modelo=" + modelo + ", manutencao=" + emManutencao;
    }
}