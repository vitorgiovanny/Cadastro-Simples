package com.simples.cadastro.interfaces;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author vitor
 */
public interface iPessoa {
    public void setNome(String nome);
    public void setDataNascimento(Date date);
    public void setCpf(String cpf);
    public void setCnpj(String cnpj);
    public void cadastrarPessoaCpf(String nome, String cpf, Date date);
    public void cadastrarPessoaCnpj(String nome, String cnpj, Date date);
    public String getNome();
    public Date getDataNascimento();
    public String getCpf();
    public String getCnpj();
}
