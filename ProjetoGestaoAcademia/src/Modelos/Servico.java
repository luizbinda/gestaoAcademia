/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author luizn
 */

@Entity
public class Servico implements Serializable {
       
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;   
    
    @Column (nullable = false, unique = true)
    private String nome;  
    
    private String descricao;    
    
    @Column (nullable = false)
    private Float valor;

    public Servico() {
    }
    
    public Servico(String nome, String descricao, Float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    

    
    
}
