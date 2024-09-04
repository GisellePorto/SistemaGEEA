package main.java.controller;

import main.java.model.Administrador;
import main.java.model.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class controllerReserva {

    private Administrador administrador;
    private ArrayList<Reserva> reservas;

    public controllerReserva(Administrador administrador) {
        this.administrador = administrador;
        this.reservas = Administrador.getReservas();
    }

    public void adicionarReserva(int idUsuarioSolicitante, String tipo, LocalDate dataReserva,
                                 LocalDate dataFinal, LocalTime horaReserva, LocalTime horaFinal, int duracao, String finalidade,
                                 String observacao) {
        Reserva reserva = new Reserva(idUsuarioSolicitante, tipo, dataReserva, dataFinal, horaReserva, horaFinal, duracao, finalidade, observacao);
        Administrador.getReservas().add(reserva);
    }

    public void removerReserva(int idReserva) {
        Iterator<Reserva> iterator = reservas.iterator();
        while (iterator.hasNext()) {
            Reserva reserva = iterator.next();
            if (reserva.getId() == idReserva) {
                iterator.remove();
            }
        }
    }

    public boolean solicitarEdicaoReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                return true;
            }
        }
        return false;
    }

    public void editarReserva(int idReserva, String tipo, LocalDate dataReserva,
                              LocalDate dataFinal, LocalTime horaReserva, LocalTime horaFinal, int duracao, String finalidade,
                              String observacao) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                reserva.setTipo(tipo);
                reserva.setDataReserva(dataReserva);
                reserva.setDataFinal(dataFinal);
                reserva.setHoraReserva(horaReserva);
                reserva.setHoraFinal(horaFinal);
                reserva.setDuracao(duracao);
                reserva.setFinalidade(finalidade);
                reserva.setObservacao(observacao);
                break;
            }
        }
    }

    public ArrayList<Reserva> listarReservas() {
        return reservas;
    }

    public Reserva buscarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                return reserva;
            }
        }
        return null;
    }
}


