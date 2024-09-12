package modelo;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private static int proximoId = 1;
    private int id;
    private String descricao;
    private int idUsuarioSolicitante;
    private String tipo;
    private LocalDate dataReserva;
    private LocalTime horaReserva;
    private LocalTime horaFinal;
    private boolean statusReserva;
    private String finalidade;
    //atributos

    private static int gerarID() {
        return proximoId++;
    }
    //gera ids acessiveis para que cada 1 tenha um especifico

    public Reserva() {
        this.id = gerarID();
        this.idUsuarioSolicitante = 0;
        this.tipo = null;
        this.dataReserva = null;
        this.horaReserva = null;
        this.horaFinal = null;
        this.statusReserva = true;
        this.finalidade = null;
    }

    public Reserva(int idUsuarioSolicitante, String tipo, LocalDate dataReserva,
                   LocalTime horaReserva, LocalTime horaFinal, String finalidade) {
        if (this.statusReserva) {
            this.id = gerarID();
            this.setIdUsuarioSolicitante(idUsuarioSolicitante);
            this.setTipo(tipo);
            this.setDataReserva(dataReserva);
            this.setHoraReserva(horaReserva);
            this.setHoraFinal(horaFinal);
            this.setFinalidade(finalidade);
        }
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

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        if (descricao != null) {
            this.descricao = descricao;
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

    public void setStatusReserva(boolean statusReserva) {
        this.statusReserva = statusReserva;
    }

    public boolean isStatusReserva() {
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

    @Override
    public String toString() {
        return "Reserva: \n" + "ID da reserva=" + id + ", ID do usuário solicitante=" + idUsuarioSolicitante +
                ", Tipo da reserva=" + tipo + ", Data da reserva=" + dataReserva +  ", Horário da reserva=" +
                horaReserva + ", Horário final=" + horaFinal + ", Status=" + statusReserva + ", Finalidade=" + finalidade;}


}