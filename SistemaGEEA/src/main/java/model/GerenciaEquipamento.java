package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaEquipamento {

    private List<Equipamento> equipamentosDisponiveis = new ArrayList<>();
    private List<Equipamento> equipamentosPendentes =  new ArrayList<>();
    private List<Equipamento> equipamentosConcluidos =  new ArrayList<>();

    public void addEquipamento(Equipamento equipamento){
       equipamentosDisponiveis = (List<Equipamento>) equipamento;
    }
    public  void addEquipamentoPendente(Equipamento equipamento) {
        equipamentosPendentes.add(equipamento);
    }
    public void aprovarEquipamento(Equipamento equipamento) {
        if (equipamentosPendentes.remove(equipamento)) {
            equipamentosConcluidos.add(equipamento);
        } else {
            System.out.println("Manutenção não encontrada na lista de pendentes.");
        }
    }


    public List<Equipamento> getEquipamentosPendentes() {
        return equipamentosPendentes;
    }

    public void setEquipamentosPendentes(List<Equipamento> equipamentosPendentes) {
        this.equipamentosPendentes = equipamentosPendentes;
    }

    public List<Equipamento> getEquipamentosDisponiveis() {
        return equipamentosDisponiveis;
    }

    public void setEquipamentosDisponiveis(List<Equipamento> equipamentosDisponiveis) {
        this.equipamentosDisponiveis = equipamentosDisponiveis;
    }

    public void equipamentosDisponiveis(List<Equipamento> equipamentosDisponiveis){
        System.out.println("Estoques disponiveis" + equipamentosDisponiveis );
    }

    public void equipamentosPendentes(){}

    public List<Equipamento> getEquipamentosConcluidos() {
        return equipamentosConcluidos;
    }

    public void setEquipamentosConcluidos(List<Equipamento> equipamentosConcluidos) {
        this.equipamentosConcluidos = equipamentosConcluidos;
    }
}
