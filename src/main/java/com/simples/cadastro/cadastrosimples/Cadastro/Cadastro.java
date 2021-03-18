
package com.simples.cadastro.cadastrosimples.Cadastro;

import com.simples.cadastro.interfaces.iFisica;
import com.simples.cadastro.interfaces.iPessoa;
import com.simples.cadastro.interfaces.iJuridica;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author vitor
 */
public class Cadastro implements iPessoa, iFisica, iJuridica {
    
    private String name;
    private String cpf;
    private String cnpj;
    private Date dataOfBirth;
    
    public Cadastro(Date date){
        this.name = "";
        this.dataOfBirth = date;
    }
    
    public String filtrarCpfCnpj(String value){
        if(value.length()<15){
            String cpf_mask;
            String cnpj_mask;
            
        if(value.length() == 11){
            this.setCpf(value);
            cpf_mask = StringUtils.left(value, 3) + 
                    "." + StringUtils.left((value.substring(value.length()-8)), 3)
                    + "." + StringUtils.left(value.substring(value.length()-5), 3)
                    +"-" + StringUtils.right(value, 2);
            return cpf_mask;
        }
        this.setCnpj(value);
        cnpj_mask = StringUtils.left(value, 2) + 
                    "." + StringUtils.left((value.substring(value.length()-12)), 3)
                    + "/" + StringUtils.left(value.substring(value.length()-6), 4)
                    +"-" + StringUtils.right(value, 2);
        return cnpj_mask;
        }
        
        return null;
    }

    public void cadastrar(String nome, String cpf_cnpj, Date date){
        this.setNome(nome);
        this.filtrarCpfCnpj(cpf_cnpj);
        this.setDataNascimento(date);
   
        if(this.filtrarCpfCnpj(cpf_cnpj).length()==11){
            this.setCpf(cpf_cnpj);
        }
        if(this.filtrarCpfCnpj(cpf_cnpj).length()<15){
            this.setCnpj(cpf_cnpj);
        }
    }
    
    @Override
    public void setNome(String nome) {
        this.name = nome;
    }

    @Override
    public void setDataNascimento(Date date) {
       this.dataOfBirth = date;
    }

    @Override
    public String getNome() {
        return this.name;
    }

    @Override
    public Date getDataNascimento() {
       return this.dataOfBirth;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getCnpj() {
       return this.cnpj;
    }
    
    
}
