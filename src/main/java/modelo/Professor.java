package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class   Professor extends Usuario {
    private String formacao;
    private ArrayList<Reserva> equipamentosReservados;
    private ArrayList<Reserva> espacosReservados;

    public Professor() {
        super();
        this.formacao = null;
    }

    public Professor(String nomeCompleto,  String cpf, String email, String senha, String formacao) {
        super(nomeCompleto, cpf, email, senha);
        this.setFormacao(formacao);
    }


    public void setFormacao(String formacao) {
        if(formacao != null) {
            this.formacao = formacao;
        }
    }

    public String getFormacao() {
        return formacao;
    }

    public void solicitarReserva(){

    }
}