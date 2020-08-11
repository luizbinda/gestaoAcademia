/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorDeTarefas;

import GerenciadorDeInterfaceGrafica.FormCadastro;
import GerenciadorDeInterfaceGrafica.FormPagamento;
import GerenciadorDeInterfaceGrafica.FormServicos;
import GerenciadorDeInterfaceGrafica.ProjetoGestaoAcademia;
import Modelos.Cliente;
import Modelos.Servico;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author luizn
 */

public class GerenciadorInterfaceGrafica {
    private ProjetoGestaoAcademia main;
    private FormPagamento pagamento;
    private FormServicos servico;
    private FormCadastro cadastro;
        
    private GerenciadorDominio gerenciador_dominio;

    public GerenciadorInterfaceGrafica() {
        main = null;  
        pagamento = null;
        gerenciador_dominio = new GerenciadorDominio();
    }    

    public GerenciadorDominio getGerenciador_dominio() {
        return gerenciador_dominio;
    }   
      
    public void abrirJanelaPrincipal() {             
       if (main == null){            
            main = new ProjetoGestaoAcademia(this);
        }        
        main.setVisible(true); 
    } 
    
    public void abriarJanelaServico() {       
        if(this.servico == null ){
            this.servico = new FormServicos(this);
            this.servico.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.servico.setVisible(true);
        }
        else {
            this.servico.setVisible(true);
        }
    }
      
    public void abriarJanelaCadastro() {       
        if(this.cadastro == null ){
            this.cadastro = new FormCadastro(this);
            this.cadastro.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.cadastro.setVisible(true);
        }
        else {
            this.cadastro.setVisible(true);
        }
    }
     
    public void abriarJanelaPagamento(Cliente cliente, Servico servico) {       
        if(this.pagamento == null ){
            this.pagamento = new FormPagamento(this, cliente, servico);
            this.pagamento.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.pagamento.setVisible(true);
        }
        else {
            this.pagamento.setVisible(true);
        }
    }
    
   
    public void carregarComboBox(JComboBox combo, Class Classe){
        List lista = gerenciador_dominio.listar(Classe);
        combo.setModel(new DefaultComboBoxModel(lista.toArray()));      
    }
    
    public void carregarComboBoxCadastro(Class Classe){
        List lista = gerenciador_dominio.listar(Classe);
        this.cadastro.getComboServico().setModel(new DefaultComboBoxModel(lista.toArray()));      
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Look and Feel não encontrado");
        }
        
        GerenciadorInterfaceGrafica gerenciador_interface_grafica;
        gerenciador_interface_grafica = new GerenciadorInterfaceGrafica();
        gerenciador_interface_grafica.abrirJanelaPrincipal();
         
    }
}

