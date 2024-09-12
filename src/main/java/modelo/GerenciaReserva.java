package modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciaReserva {
    private static List<Reserva> reservasPendentes = new ArrayList<>();
    private static List<Reserva> reservasRejeitadas = new ArrayList<>();
    private static List<Reserva> reservasAprovadas = new ArrayList<>();
    private static List<Reserva> reservasCanceladas = new ArrayList<>();


    public void criaReserva(Reserva reserva) {
        reservasPendentes.add(reserva);
        //System.out.println("Reserva criada e adicionada às pendentes: " + reserva.getDescricao());
    }

    //metodo aprovarReserva, que aprova a reserva a colocando na lista de reservas aprovadas
    public void aprovarReserva(Reserva reserva) {
        if (reservasPendentes.contains(reserva)) {
            reservasAprovadas.add(reserva);
            reservasPendentes.remove(reserva);
            //System.out.println("Reserva aprovada: " + reserva.getDescricao());
        }
    }

    //metodo rejeitarReserva, nele o administrador deve ser capaz de rejeitar o pedido de reserva recebido, a reserva é entao armazenada em reservas rejeitadas
    public void rejeitarReserva(Reserva reserva) {
        if (reservasPendentes.remove(reserva)) {
            reservasRejeitadas.add(reserva);
            //System.out.println("Reserva rejeitada: " + reserva.getDescricao());
        } else {
            //System.out.println("Reserva não encontrada entre as pendentes.");
        }
    }

    public void alterarDisponibilidade(Reserva reserva) {
        if (reservasAprovadas.contains(reserva)) {
            reserva.setStatusReserva(!reserva.isStatusReserva());
            //System.out.println("Disponibilidade da reserva alterada: " + reserva.getDescricao());
        } else {
            //System.out.println("Apenas reservas aprovadas podem ter sua disponibilidade alterada.");
        }
    }

    public void alterarReserva() {
        /*Esse método será utilizado para alterar algum dados reserva
        de equipamento ou espaco cadastrada*/
    }

    public void removerReserva() {
        /*Esse método será utilizado para remover uma reserva
        de equipamento ou espaco cadastrada*/
    }
}
