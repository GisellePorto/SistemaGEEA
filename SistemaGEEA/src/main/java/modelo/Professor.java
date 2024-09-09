package modelo;

import java.time.LocalDate;

public class   Professor extends Usuario {
    private String formacao;

    public Professor() {
        super();
        this.formacao = null;
    }

    public Professor(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String formacao) {
        super(nomeCompleto, dataNascimento, cpf, telefone, email, senha);
        this.setFormacao(formacao);
    }


    public void setFormacao(String formacao) {
        if(formacao != null && !formacao.isEmpty()) {
            this.formacao = formacao;
        }
    }

    public String getFormacao() {
        return formacao;
    }



    public void compartilharReserva() {
        /*Esse método será utilizado para compatilhar reserva para outro professor,
        caso mesmo depois de tido a aprovação do coordenado/diretor poderá compatilhar a reserva*/
    }

    public void aceitarReserva() {
        /*Esse método será utilizado para aceitar reserva compatilhada por outro professor*/
    }

}