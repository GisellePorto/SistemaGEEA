package model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaReserva {
    private List<Reserva> reservasPendentes;
    private List<Reserva> reservasRejeitadas;
    private List<Reserva> reservasAprovadas;


    public GerenciaReserva() {
        this.reservasPendentes = new ArrayList<>();
        this.reservasRejeitadas = new ArrayList<>();
        this.reservasAprovadas = new ArrayList<>();
    }


    public void criaReserva(Reserva reserva) {
        reservasPendentes.add(reserva);
        System.out.println("Reserva criada e adicionada às pendentes: " + reserva.getDescricao());
    }

    //metodo aprovarReserva, nele o administrador deve ser capaz de autorizar o pedido de reserva recebido
    public void aprovarReserva(Reserva reserva) {
        if (reservasPendentes.remove(reserva)) {
            reservasAprovadas.add(reserva);
            System.out.println("Reserva aprovada: " + reserva.getDescricao());
        } else {
            System.out.println("Reserva não encontrada entre as pendentes.");
        }
    }

    //metodo rejeitarReserva, nele o administrador deve ser capaz de rejeitar o pedido de reserva recebido
    public void rejeitarReserva(Reserva reserva) {
        if (reservasPendentes.remove(reserva)) {
            reservasRejeitadas.add(reserva);
            System.out.println("Reserva rejeitada: " + reserva.getDescricao());
        } else {
            System.out.println("Reserva não encontrada entre as pendentes.");
        }
    }

    public void alterarDisponibilidade(Reserva reserva) {
        if (reservasAprovadas.contains(reserva)) {
            reserva.setDisponivel(!reserva.isDisponivel());
            System.out.println("Disponibilidade da reserva alterada: " + reserva.getDescricao());
        } else {
            System.out.println("Apenas reservas aprovadas podem ter sua disponibilidade alterada.");
        }
    }
}
