/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simples.cadastro.cadastrosimples;

import com.simples.cadastro.cadastrosimples.Cadastro.Cadastro;
import com.simples.cadastro.cadastrosimples.Cadastro.TipoUsuario;
import com.simples.cadastro.interfaces.iPessoa;
import com.simples.cadastro.usuario.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author vitor
 */
public class main {
    public static void main(String[] args) {
        iPessoa usuario  = Cadastro.criarUsuario(TipoUsuario.CPF);
        Date nascimento = new Date("06/01/1996");
        usuario.cadastrarPessoaCpf("vitor", "00000000000", nascimento);
        System.out.println(usuario.getCpf());
        
    }
}
