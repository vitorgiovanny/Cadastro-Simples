/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simples.cadastro.cadastrosimples.Cadastro;

import com.simples.cadastro.interfaces.iPessoa;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author vitor
 */
public class Cpf implements iPessoa {

    private String nome;
    private Date nscimento;
    private String cpf;    
    
    public Cpf(){
        
    }
    
    public void cadastrarPessoaCpf(String nome, String cpf, Date date){
        this.setNome(nome);
        this.setDataNascimento(date);
        if(this.verificarCpf(cpf) != null){
            this.setCpf(cpf);
        }
    }

    public String verificarCpf(String cpf){
            String cpf_mask;
            if(cpf.length() == 11){
                this.setCpf(cpf);
                cpf_mask = StringUtils.left(cpf, 3) + 
                        "." + StringUtils.left((cpf.substring(cpf.length()-8)), 3)
                        + "." + StringUtils.left(cpf.substring(cpf.length()-5), 3)
                        +"-" + StringUtils.right(cpf, 2);
                return cpf_mask;
            }
            return null;
    }
    
        @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setDataNascimento(Date date) {
        this.nscimento = date;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Date getDataNascimento() {
        return this.nscimento;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCnpj(String cnpj) {
        
    }

    @Override
    public String getCnpj() {
        return null;
    }

    @Override
    public void cadastrarPessoaCnpj(String nome, String cnpj, Date date) {
        
    }
    
}
