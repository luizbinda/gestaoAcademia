/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.text.ParseException;
import javax.persistence.*;

/**
 *
 * @author luizn
 */

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column ( updatable = false, nullable = false, length = 14)
    private String CPF;
    
    @Column ( unique = true, nullable = false)
    private String nome;    
    
    @Column ( unique = true, nullable = false)
    private String telefone;
    
    @ManyToOne
    @JoinColumn ( name = "id_servico")
    private Servico servico;

    public Cliente() {
    }
    
    public Cliente(String CPF, String nome, String telefone, Servico servico) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] { this, nome, servico};
    }
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    

}
