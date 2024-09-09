package modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciaEspacos {
    private List<Espaco> espacosDisponiveis = new ArrayList<>();
    private List<Espaco> espacosPendentes =  new ArrayList<>();
    private List<Espaco> espacosConcluidos =  new ArrayList<>();

    public void addEspaco(Espaco espaco){
        espacosDisponiveis = (List<Espaco>) espaco;
    }

    public  void addEspacoPendente(Espaco espaco) {
        espacosPendentes.add(espaco);
    }

    public void aprovarEspaco(Espaco espaco) {
        if (espacosPendentes.remove(espaco)) {
            espacosConcluidos.add(espaco);
        } else {
            System.out.println("Manutenção não encontrada na lista de pendentes.");
        }
    }


    public List<Espaco> getEspacosPendentes() {
        return espacosPendentes;
    }

    public void setEspacosPendentes(List<Espaco> espacosPendentes) {
        this.espacosPendentes = espacosPendentes;
    }

    public List<Espaco> getEspacosDisponiveis() {
        return espacosDisponiveis;
    }

    public void setEspacosDisponiveis(List<Espaco> espacosDisponiveis) {
        this.espacosDisponiveis = espacosDisponiveis;
    }

    public void espacosDisponiveis(List<Espaco> eepacosDisponiveis){
        System.out.println("Ambientes disponiveis" + espacosDisponiveis );
    }

    public void espacosPendentes(){}

    public List<Espaco> getEquipamentosConcluidos() {
        return espacosConcluidos;
    }

    public void setEspacosConcluidos(List<Espaco> espacosConcluidos) {
        this.espacosConcluidos = espacosConcluidos;
    }
}
