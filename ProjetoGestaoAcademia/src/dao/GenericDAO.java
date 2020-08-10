/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author luizn
 */
public class GenericDAO {
    
    public List listar(Class Classe) throws HibernateException {
        Session sessao = null;
        List lista = null;

        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();                
            Criteria consulta = sessao.createCriteria(Classe);                
            lista = consulta.list();                       
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException (ex);
        }            
        return lista;            
    }
    
    public void inserir(Object Classe) throws HibernateException {
        Session sessao = null;
       
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();                
                            
            sessao.save(Classe);
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException (ex);
        }            
                  
    }
    
    public void update(Object Classe) throws HibernateException{
        Session sessao = null;
       
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();                
                            
            sessao.update(Classe);
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException (ex);
        }                     
    }
    
    public void delete(Object Classe) throws HibernateException{
        Session sessao = null;
       
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();                
                            
            sessao.delete(Classe);
            sessao.getTransaction().commit();
            sessao.close();
        }catch(HibernateException ex){
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException (ex);
        }                     
    }
    
    
}
