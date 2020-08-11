/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorDeTarefas;

import Modelos.Cliente;
import Modelos.Pagamento;
import Modelos.Servico;
import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author luizn
 */
public class GerenciadorDominio {
    
    private GenericDAO generic_dao;    
    private ClienteDAO cliente_dao;

    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
        generic_dao = new GenericDAO();        
        cliente_dao = new ClienteDAO();
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
    
    public void realizarPagamento(Cliente cliente){
        Pagamento pagamento = new Pagamento( cliente.getServico().getValor(),  new Date(),  cliente);
        generic_dao.inserir(pagamento);
    }
    
     public List<Cliente> buscarClientesPorNome(String nome){
        return cliente_dao.pesquisar(nome);
    }
    
    
}
