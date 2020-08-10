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
    
}
