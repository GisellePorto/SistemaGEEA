package model;

public class Administrador extends Usuario{

    public Administrador(String emailInstitucional, String senha){

        super(emailInstitucional, senha);
    }

    //metodo rejeitarReserva, nele o administrador deve ser capaz de rejeitar o pedido de reserva recebido

    public void rejeitarReserva(Reserva reserva) {
        reserva.setAprovacao(false);
        System.out.println("Reserva rejeitada: " + reserva);
    }


}