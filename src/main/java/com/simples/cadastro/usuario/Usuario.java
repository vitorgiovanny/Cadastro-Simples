/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simples.cadastro.usuario;

import com.simples.cadastro.cadastrosimples.Cadastro.Cadastro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vitor
 */
public class Usuario {
    private List<Cadastro> cadastro;
    public Usuario(List<Cadastro> value){
        this.cadastro = value;
    }
    
    public void ListUsersNames(){
        Iterator<Cadastro> cads = this.cadastro.iterator();
        while(cads.hasNext()){
            Cadastro it = cads.next();
            System.out.println(it.getNome());
            System.out.println(it.getDataNascimento());
        }
    }
}
