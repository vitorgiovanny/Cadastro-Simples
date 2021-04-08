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
public class Usuario implements Iterator {
    private Cadastro[] cadastro;
    private int posicao = 0;
    
    public Usuario(Cadastro[] cad){
       
        this.cadastro = cad;
    }

    @Override
    public boolean hasNext() {
       if(this.posicao>= this.cadastro.length || this.cadastro[this.posicao] == null){
           return false;
       }
       return true;
    }

    @Override
    public Object next() {
       Cadastro cadastro = this.cadastro[this.posicao];
       this.posicao++;
       return cadastro;
    }
}
