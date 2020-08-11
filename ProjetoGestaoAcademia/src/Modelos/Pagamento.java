/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author luizn
 */

@Entity
public class Pagamento implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;      
    private Float valor;    
    private Date data_pagamento;
    @ManyToOne
    @JoinColumn ( name = "id_cliente")
    private Cliente cliente;

    public Pagamento() {
    }

    public Pagamento(Float valor, Date data_pagamento, Cliente cliente) {
        this.valor = valor;
        this.data_pagamento = data_pagamento;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
