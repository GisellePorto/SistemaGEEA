package main.java.model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private static int proximoId = 1;
    private int id;
    private int idUsuarioSolicitante;
    private int idUsuarioAprovador;
    private String tipo;
    private LocalDate dataReserva;
    private LocalDate dataFinal;
    private LocalTime horaReserva;
    private LocalTime horaFinal;
    private int duracao;
    private boolean statusReserva;
    private String finalidade;
    private String observacao;

    private static int gerarID() {
        return proximoId++;
    }

    public Reserva() {
        this.id = gerarID();
        this.idUsuarioSolicitante = 0;
        this.idUsuarioAprovador = 0;
        this.tipo = null;
        this.dataReserva = null;
        this.dataFinal = null;
        this.horaReserva = null;
        this.horaFinal = null;
        this.duracao = 0;
        this.statusReserva = false;
        this.finalidade = null;
        this.observacao = null;
    }

    public Reserva(int idUsuarioSolicitante, int idUsuarioAprovador, String tipo, LocalDate dataReserva,
                   LocalDate dataFinal, LocalTime horaReserva, LocalTime horaFinal, int duracao, boolean statusReserva,
                   String finalidade, String observacao) {
        this.id = gerarID();
        this.setIdUsuarioSolicitante(idUsuarioSolicitante);
        this.setIdUsuarioAprovador(idUsuarioAprovador);
        this.setTipo(tipo);
        this.setDataReserva(dataReserva);
        this.setDataFinal(dataFinal);
        this.setHoraReserva(horaReserva);
        this.setHoraFinal(horaFinal);
        this.setDuracao(duracao);
        this.setStatusReserva(statusReserva);
        this.setFinalidade(finalidade);
        this.setObservacao(observacao);
    }

    public Reserva(int idUsuarioSolicitante, String tipo, LocalDate dataReserva, LocalDate dataFinal,
                   LocalTime horaReserva, LocalTime horaFinal, int duracao, String finalidade, String observacao) {
        this.id = gerarID();
        this.setIdUsuarioSolicitante(idUsuarioSolicitante);
        this.setTipo(tipo);
        this.setDataReserva(dataReserva);
        this.setDataFinal(dataFinal);
        this.setHoraReserva(horaReserva);
        this.setHoraFinal(horaFinal);
        this.setDuracao(duracao);
        this.setFinalidade(finalidade);
        this.setObservacao(observacao);
    }

    public int getId() {
        return id;
    }

    public int getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public void setIdUsuarioSolicitante(int idUsuarioSolicitante) {
        if(idUsuarioSolicitante > 0){
            this.idUsuarioSolicitante = idUsuarioSolicitante;
        }
    }

    public int getIdUsuarioAprovador() {
        return idUsuarioAprovador;
    }

    public void setIdUsuarioAprovador(int idUsuarioAprovador) {
        if(idUsuarioAprovador > 0){
            this.idUsuarioAprovador = idUsuarioAprovador;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo != null){
            this.tipo = tipo;
        }
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        if (dataReserva != null) {
            this.dataReserva = dataReserva;
        }
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        if (dataFinal != null) {
            this.dataFinal = dataFinal;
        }
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
        if (horaReserva != null) {
            this.horaReserva = horaReserva;
        }
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        if (horaFinal != null) {
            this.horaFinal = horaFinal;
        }
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao > 0){
            this.duracao = duracao;
        }
    }

    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }

    public boolean isStatusEspaco() {
        return statusReserva;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        if(finalidade != null){
            this.finalidade = finalidade;
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        if(observacao != null){
            this.observacao = observacao;
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "ID da reserva=" + id + ", ID do usuário solicitante=" + idUsuarioSolicitante + ", ID do usuário aprovador=" + idUsuarioAprovador + ", Tipo da reserva=" + tipo + ", Data da reserva=" + dataReserva + ", Data final=" + dataFinal + ", Horário da reserva=" + horaReserva + ", Horário final=" + horaFinal + ", Duração=" + duracao + ", Status=" + statusReserva + ", Finalidade=" + finalidade + ", Observação=" + observacao + '}';}

    public void solicitarReserva() {
        /*Esse método será utilizado para o usuario realizar a solicitação
        da reserva do espaço ou equipamento */
    }

    public void alterarReserva() {
        /*Esse método será utilizado para alterar a reserva
        realizada pelo usuário, caso tenha informado algum dado incorreto */
    }

    public void rejeitarReserva() {
        /*Esse método será utilizado pelo coordenador ou diretor, quando a
        reserva não for possivel conceder a aprovação*/
    }

    public void aprovarReserva() {
        /*Esse método será utilizado pelo coordenador ou diretor para
        aprovar a reserva realizada por um usuário*/
    }

    public void excluirRerserva() {
        /*Esse método será utilizado para excluir a reserva realizada e ou aprovada*/
    }

    public void atualizarStatus(){
        /*Esse método será utilizado para atualizar o status da reserva
         pelo atributo statusReserva*/
    }

}

