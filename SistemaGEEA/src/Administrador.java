public class Administrador extends Usuario{

    public Administrador(String login, String senha){
        super(login, senha);
    }
    //metodo aprovarReserva, nele o administrador deve ser capaz de autorizar o pedido de reserva recebido
    public void aprovarReserva(Reserva reserva) {
            reserva.setAprovacao(true);
            System.out.println("Reserva aprovada: " + reserva);
        }
    //metodo rejeitarReserva, nele o administrador deve ser capaz de rejeitar o pedido de reserva recebido

    public void rejeitarReserva(Reserva reserva) {
            reserva.setAprovacao(false);
            System.out.println("Reserva rejeitada: " + reserva);
        }
    
    public void cadastrarEspaco(String nome, int numSerie){
        //metodo para cadastrar um espaco e armazenar no estoque
    }  
}