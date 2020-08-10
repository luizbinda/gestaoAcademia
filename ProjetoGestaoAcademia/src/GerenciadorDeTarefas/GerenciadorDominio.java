/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorDeTarefas;

import Modelos.Cliente;
import Modelos.Servico;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luizn
 */
public class GerenciadorDominio {
    
    private GenericDAO generic_dao;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
        generic_dao = new GenericDAO();
    }
    
    public List listar( Class classe) throws HibernateException {
        return generic_dao.listar( classe );
    }

    public void inserirServico(String nome, String descricao, Float valor)throws HibernateException{
        Servico servico = new Servico(nome, descricao, valor);
        generic_dao.inserir(servico);
    }
    
    public void inserirCliente(String CPF, String nome, String telefone, Servico servico)throws HibernateException{
        Cliente cliente = new Cliente(CPF, nome, telefone, servico);
        generic_dao.inserir(cliente);
    }
    
    
}
