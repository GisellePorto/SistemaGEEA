public class SolicitarManutencao {
    private Usuario usuario;
    private String comentario;

    public SolicitarManutencao(Usuario usuario, String comentario){
        setUsuario(usuario);
        setComentario(comentario);
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return this.comentario;
    }
}
