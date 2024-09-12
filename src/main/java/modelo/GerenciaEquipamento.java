package modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciaEquipamento {

    private static List<Equipamento> equipamentosDisponiveis = new ArrayList<>();
    private static List<Equipamento> equipamentosPendentes =  new ArrayList<>();
    private static List<Equipamento> equipamentosConcluidos =  new ArrayList<>();
    private static List<Equipamento> equipamentosParaManutencao = new ArrayList<>();

    public void addEquipamento(Equipamento equipamento){
       equipamentosDisponiveis.add(equipamento);
    }

    public  void addEquipamentoPendente(Equipamento equipamento) {
        equipamentosPendentes.add(equipamento);
    }

    public void aprovarEquipamento(Equipamento equipamento) {
        if (equipamentosPendentes.remove(equipamento)) {
            equipamentosConcluidos.add(equipamento);
        }
//        else {
//            System.out.println("Manutenção não encontrada na lista de pendentes.");
//        }
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
        GerenciaEquipamento.equipamentosDisponiveis = equipamentosDisponiveis;
    }

    public void equipamentosDisponiveis(List<Equipamento> equipamentosDisponiveis){
        System.out.println("Estoques disponiveis" + equipamentosDisponiveis );
    }

    public void equipamentosPendentes(){}

    public List<Equipamento> getEquipamentosConcluidos() {
        return equipamentosConcluidos;
    }

    public void setEquipamentosConcluidos(List<Equipamento> equipamentosConcluidos) {
        GerenciaEquipamento.equipamentosConcluidos = equipamentosConcluidos;
    }
}
