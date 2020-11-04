package br.edu.iftm.os.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Permissao implements Serializable {

    private Integer id;
    private String nome;
    private String descricao;
    
}
