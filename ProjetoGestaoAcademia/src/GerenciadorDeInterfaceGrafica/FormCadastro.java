/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorDeInterfaceGrafica;

import GerenciadorDeTarefas.GerenciadorInterfaceGrafica;
import GerenciadorDeTarefas.Uteis;
import Modelos.Servico;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author luizn
 */
public class FormCadastro extends javax.swing.JFrame {

    private GerenciadorInterfaceGrafica gerenciador;
    
    public FormCadastro(GerenciadorInterfaceGrafica gerenciador) {
        initComponents();
        setResizable(false);
        this.gerenciador = gerenciador;
        this.gerenciador.carregarComboBox(ComboServico, Servico.class);
    }
    
    public JComboBox getComboServico(){
        return this.ComboServico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabelNome5 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        InputNome = new javax.swing.JTextField();
        InputCPF = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        InputTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelServico = new javax.swing.JLabel();
        ComboServico = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musculação", "Box", "Karate", "jiu jitsu" }));

        jLabelNome5.setText("Tipo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setText("Nome");
        jPanelCadastro.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));
        jPanelCadastro.add(InputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 16, 156, -1));
        jPanelCadastro.add(InputCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 46, 156, -1));

        labelCPF.setText("CPF");
        jPanelCadastro.add(labelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));
        jPanelCadastro.add(InputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 76, 156, -1));

        labelTelefone.setText("Telefone");
        jPanelCadastro.add(labelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 244, 52));

        labelServico.setText("Serviço");
        jPanelCadastro.add(labelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 106, -1, -1));

        ComboServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Dia", "1 Semana", "1 Mes" }));
        jPanelCadastro.add(ComboServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 106, 157, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ( validarCampos() ){
            try {
                gerenciador.getGerenciador_dominio().inserirCliente( 
                        InputCPF.getText(), 
                        InputNome.getText(), 
                        InputTelefone.getText(), 
                        (Servico) ComboServico.getSelectedItem()
                );
                JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado com Sucesso!");
            }catch(HibernateException ex){
                JOptionPane.showMessageDialog(rootPane, "Error ao Cadastrar Cliente");
            }     
            InputCPF.setText("");
            InputNome.setText(""); 
            InputTelefone.setText("");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarCampos() {        
        String msgErro = "";        
        labelNome.setForeground(Color.black);
        labelCPF.setForeground(Color.black); 
        labelTelefone.setForeground(Color.black);                
        if ( InputNome.getText().isEmpty() ) {
            msgErro = msgErro + "Digite seu nome.\n";
            labelNome.setForeground(Color.red);            
        }
        
        if ( InputTelefone.getText().isEmpty() ) {
            msgErro = msgErro + "Digite seu Telefone.\n";
            labelTelefone.setForeground(Color.red);            
        }
        
        if ( Uteis.isCPF( InputCPF.getText() ) == false  ) {
            msgErro = msgErro + "CPF inválido.\n";
            labelCPF.setForeground(Color.red); 
        }   
        
        if(ComboServico.getSelectedItem()== null){
            msgErro = msgErro + "Selecione um Serviço.\n";
            labelServico.setForeground(Color.red); 
        } else {
        }
        
        if ( msgErro.isEmpty() ) {
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            return false;
        }  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboServico;
    private javax.swing.JTextField InputCPF;
    private javax.swing.JTextField InputNome;
    private javax.swing.JTextField InputTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabelNome5;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelServico;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
}
