package com.facebook.dominio
        ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Redesocial {
    private List<usuario> listaUsuario = new LinkedList<>();

    public usuario criarConta(String email, String senha, String nome){
       // criar objeto usuario
       // adicionar usuario a lista
        // retornar usuario
        var usuario = new usuario(email, nome, senha);
        listaUsuario.add(usuario);
        return usuario;
    }
}
