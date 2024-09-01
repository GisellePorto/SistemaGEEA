package model;

import java.time.LocalTime;
import java.time.LocalDate;
public class Equipamento {
    private String nome;
    private boolean disponibilidade = true;
    private Equipamento equipamento;
    private LocalTime horario;
    private LocalDate data;
    private String descricao;


    public Equipamento(String nome,Equipamento equipamento, LocalTime horario, LocalDate data, String descricao) {
        this.nome = nome;
        this.equipamento = equipamento;
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
    public int getNumSerie(){
        return numSerie;
    }
    public void setNumSerie(int numSerie){
        this.numSerie = numSerie;
    }
    public String getDescricao() {
        return descricao;
    }
    public Equipamento getEquipamento(){
        return this.equipamento;
    }
    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
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










