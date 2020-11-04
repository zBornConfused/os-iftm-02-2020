package br.edu.iftm.os.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named
@SessionScoped
@Getter @Setter
public class TesteBean implements Serializable {
    
    private String nome;
    private String ola;
    
    public void dizerOla(){
        this.ola = "Olá " + nome;
    }
    
}