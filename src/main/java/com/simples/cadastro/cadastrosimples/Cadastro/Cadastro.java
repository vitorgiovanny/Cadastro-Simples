
package com.simples.cadastro.cadastrosimples.Cadastro;


import com.simples.cadastro.interfaces.iPessoa;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author vitor
 */
public class Cadastro{

    public Cadastro(){

    }
    
    public static iPessoa criarUsuario(TipoUsuario value){
        if(value.equals(TipoUsuario.CNPJ)){
            return new Cnpj();
        }else if(value.equals(TipoUsuario.CPF)){
            return new Cpf();
        }
        return null;
    }
}
