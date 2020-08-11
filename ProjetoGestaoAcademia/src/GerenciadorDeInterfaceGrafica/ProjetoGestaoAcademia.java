/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorDeInterfaceGrafica;

import GerenciadorDeTarefas.GerenciadorInterfaceGrafica;
import Modelos.Cliente;
import Modelos.Servico;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;


/**
 *
 * @author luizn
 */
public class ProjetoGestaoAcademia extends javax.swing.JFrame {
    
    private GerenciadorInterfaceGrafica gerenciador;

    /**
     * Creates new form Main
     */
    public ProjetoGestaoAcademia(GerenciadorInterfaceGrafica gerenciador) {
        initComponents();
        setResizable(false);
        this.gerenciador = gerenciador;
        preencherTabela(gerenciador.getGerenciador_dominio().listar(Cliente.class));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemPagamento = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastroCliente = new javax.swing.JButton();
        jButtonCadastroServico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemServico = new javax.swing.JMenuItem();

        jMenuItemPagamento.setText("Realizar Pagamento");
        jMenuItemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPagamentoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemPagamento);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 400));
        jPanel1.setName(""); // NOI18N

        jButtonCadastroCliente.setText("Cadastrar Cliente");
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });

        jButtonCadastroServico.setText("Cadastro Serviço");
        jButtonCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroServicoActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setResizable(false);
            jTableClientes.getColumnModel().getColumn(1).setMinWidth(150);
            jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Cadastros.setText("Cadastros");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        Cadastros.add(jMenuItemCliente);

        jMenuItemServico.setText("Serviço");
        jMenuItemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicoActionPerformed(evt);
            }
        });
        Cadastros.add(jMenuItemServico);

        jMenuBar1.add(Cadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
        // TODO add your handling code here:
        gerenciador.abriarJanelaCadastro();
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        gerenciador.abriarJanelaCadastro();
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jButtonCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroServicoActionPerformed
        // TODO add your handling code here:
        gerenciador.abriarJanelaServico();
    }//GEN-LAST:event_jButtonCadastroServicoActionPerformed

    private void jMenuItemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicoActionPerformed
        // TODO add your handling code here:
        gerenciador.abriarJanelaServico();
    }//GEN-LAST:event_jMenuItemServicoActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(jTableClientes, evt.getX(), evt.getY());
    }//GEN-LAST:event_jTableClientesMouseClicked
    
    private void jMenuItemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPagamentoActionPerformed
        
        gerenciador.abriarJanelaPagamento(
                (Cliente)jTableClientes.getModel().getValueAt(jTableClientes.getSelectedRow(), 0),
                (Servico)jTableClientes.getModel().getValueAt(jTableClientes.getSelectedRow(), 2));
    }//GEN-LAST:event_jMenuItemPagamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        preencherTabela(gerenciador.getGerenciador_dominio().buscarClientesPorNome(jTextFieldValor.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void preencherTabela( List<Cliente> clientes){
        try {
            List<Cliente> lista = clientes; 
            // Limpar a tabela
            ((DefaultTableModel) jTableClientes.getModel()).setRowCount(0);
            
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Não existem registros com essa pesquisa.");
            } else {
                for ( Cliente cli : lista ){
                    ((DefaultTableModel) jTableClientes.getModel()).addRow( cli.toArray() );
                }
            }
            
            
        } catch ( ParseException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar cliente." + ex);
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonCadastroServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemPagamento;
    private javax.swing.JMenuItem jMenuItemServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

}
