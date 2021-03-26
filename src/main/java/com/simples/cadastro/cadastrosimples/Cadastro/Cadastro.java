
package com.simples.cadastro.cadastrosimples.Cadastro;


import com.simples.cadastro.interfaces.iPessoa;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author vitor
 */
public class Cadastro implements iPessoa {
    
    private String name;
    private String cpf;
    private String cnpj;
    private Date dataOfBirth;

    public Cadastro(Date date){
        this.name = "";
        this.dataOfBirth = date;
    }
    
    public void cadastrarPessoaCpf(String nome, String cpf, Date date){
        this.setNome(nome);
        this.setDataNascimento(date);
        if(this.verificarCpf(cpf) != null){
            this.setCpf(cpf);
        }
    }
    
    
    public void cadastrarPessoaCnpj(String nome, String cnpj, Date date){
        this.setNome(nome);
        this.setDataNascimento(date);
        
        if(this.verificarCnpj(cnpj) != null){
            this.setCnpj(cnpj);
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

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
       return this.cnpj;
    }
    
    
}
