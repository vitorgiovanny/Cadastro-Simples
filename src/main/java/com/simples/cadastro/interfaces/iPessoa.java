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
    public String getNome();
    public Date getDataNascimento();
}
