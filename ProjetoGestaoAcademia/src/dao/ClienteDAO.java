/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelos.Cliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author luizn
 */
public class ClienteDAO extends GenericDAO{
    
    public List<Cliente> pesquisar(String pesq) throws HibernateException {
        
        Session sessao = null;
        List lista = null;

        try   {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Cliente.class);            
            consulta.add( Restrictions.like("nome", pesq+"%") );                           
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;                             
    }
        
}
