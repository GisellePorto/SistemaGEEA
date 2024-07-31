
public class Notificacao {
    private Usuario destinatario;
    private String mensagem;

    public Notificacao(Usuario destinatario, String mensagem){
        setDestinatario(destinatario);
        setMensagem(mensagem);
    }

    public void setDestinatario(Usuario destinatario){
        this.destinatario = destinatario;
    }

    public Usuario getDestinatario(){
        return this.destinatario;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}
