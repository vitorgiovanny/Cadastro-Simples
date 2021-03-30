/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simples.cadastro.cadastrosimples.Cadastro;

import com.simples.cadastro.interfaces.iPessoa;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;


public class Cnpj implements iPessoa{
    private String nome;
    private Date nscimento;
    private String cpf;
    private String cnpj;
    
    public Cnpj(){
        this.cpf = null;
    }

    public void cadastrarPessoaCnpj(String nome, String cnpj, Date date){
        this.setNome(nome);
        this.setDataNascimento(date);
        
        if(this.verificarCnpj(cnpj) != null){
            this.setCnpj(cnpj);
        }
    }
       
    
    private String verificarCnpj(String cnpj){
        String cnpj_mask;
        if(cnpj.length()<15){
        cnpj_mask = StringUtils.left(cnpj, 2) + 
                    "." + StringUtils.left((cnpj.substring(cnpj.length()-12)), 3)
                    + "/" + StringUtils.left(cnpj.substring(cnpj.length()-6), 4)
                    +"-" + StringUtils.right(cnpj, 2);
        return cnpj_mask;
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

    /**
     * @return the cnpj
     */
    @Override
    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    @Override
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void cadastrarPessoaCpf(String nome, String cpf, Date date) {
        
    }
    
    
}
