public class Equipamento {
    private String nome;
    private boolean disponibilidade = true;
    private int numSerie;

    public Equipamento(String nome){
        setNome(nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    //metodo de verificar se o equipamento esta disponivel ou nao para reserva e utilizacao
    public boolean verificarDisponibilidade() {
    	return this.disponibilidade;
    }
}