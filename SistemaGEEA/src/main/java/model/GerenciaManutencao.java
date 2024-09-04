package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaManutencao {
    private List<SolicitarManutencao> manutencoesPendentes = new ArrayList<>();
    private List<SolicitarManutencao> manutencoesConcluidas = new ArrayList<>();


    public  void addManutencaoPendente(SolicitarManutencao manutencao) {
        manutencoesPendentes.add(manutencao);
    }

    public void concluirManutencao(SolicitarManutencao manutencao) {
        if (manutencoesPendentes.remove(manutencao)) {
            manutencoesConcluidas.add(manutencao);
        } else {
            System.out.println("Manutenção não encontrada na lista de pendentes.");
        }
    }

    public List<SolicitarManutencao> getManutencoesPendentes() {
        return manutencoesPendentes;
    }

    public List<SolicitarManutencao> getManutencoesConcluidas() {
        return manutencoesConcluidas;
    }


}
