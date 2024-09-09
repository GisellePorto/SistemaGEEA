package controller;

import modelo.Administrador;
import modelo.Usuario;

import java.util.ArrayList;

public class ControllerUsuario {
    private ArrayList<Usuario> usuarios = Administrador.getUsuarios();

    public Usuario fazerLogin(String email, String senha) {

        for (Usuario usuario : usuarios) {

            if (usuario.getEmail().trim().equals(email.trim()) && usuario.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido para o usuário: " + usuario.getNomeCompleto());
                return usuario;
            }
        }

        System.out.println("Login falhou para email: " + email);
        return null;
    }
}
