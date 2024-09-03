package model;

import java.time.LocalTime;
import java.time.LocalDate;
public class Equipamento {
    private String nome;
    private boolean disponibilidade = true;
    private LocalTime horario;
    private LocalDate data;
    private String descricao;


    public Equipamento(String nome, LocalTime horario, LocalDate data, String descricao) {
        this.nome = nome;
        this.horario = horario;
        this.data = data;
        this.descricao = descricao;

    }


    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalTime getHorario() {
        return horario;
    }
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //metodo de verificar se o equipamento esta disponivel ou nao para reserva e utilizacao
    public boolean verificarDisponibilidade() {

        return this.disponibilidade;
    }
}










