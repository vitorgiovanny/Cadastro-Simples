/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simples.cadastro.cadastrosimples;

import com.simples.cadastro.cadastrosimples.Cadastro.Cadastro;
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
        List <Cadastro> cadastros;
        cadastros = new ArrayList<Cadastro>();
      
        Cadastro cad = new Cadastro(null);
        Cadastro cad2 = new Cadastro(null);
        
        Usuario usuarios = new Usuario(cadastros);
        Date data = new Date("01/01/1900");
        
        cad.cadastrar("vitor", "06586181569", data);
        cad2.cadastrar("giovanny", "91929123192", data);
        
        cadastros.add(cad);
        cadastros.add(cad2);
        
        usuarios.ListUsersNames();
        
       /*for(int i = 0; i<usuarios.listUsuaria(cadastros).size();i++){
           System.out.println(usuarios.listUsuaria(cadastros).get(i).getNome());
       }*/
       
    }
}