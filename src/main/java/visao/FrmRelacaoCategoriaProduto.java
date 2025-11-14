package visao;

import cliente.ConexaoRMI;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Produto;
import servicos.ServicoCategoria;
import servicos.ServicoProduto;

public class FrmRelacaoCategoriaProduto extends javax.swing.JFrame {

    public FrmRelacaoCategoriaProduto() {
        initComponents();
        setLocationRelativeTo(null);
        carregarDados();
        setLocationRelativeTo(null); // Centraliza a janela
    }

    private void carregarDados() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela
        
        try {
           // Conecta ao serviço remoto
           ServicoCategoria servicoCategoria = ConexaoRMI.getServicoCategoria();
           ServicoProduto servicoProduto = ConexaoRMI.getServicoProduto();
           // Obtém todas as categorias
           ArrayList<Categoria> categorias = servicoCategoria.listarCategorias();
           
           for (Categoria categoria : categorias) {
               // Conta quantos produtos pertecem a esta categoria
               int contador = 0;
               for (Produto produto : servicoProduto.listarProdutos()) {
                   if (produto.getCategoriaId() == categoria.getIdCategoria()) {
                       contador++;
                   }
               }
               // Adiciona na tabela
               model.addRow(new Object[]{categoria.getNome(), contador});
           }
} catch (RemoteException e) {
    JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBatualizar = new javax.swing.JButton();
        JBfechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria", "Quantidade de Produtos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        JBatualizar.setText("Atualizar");
        JBatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatualizarActionPerformed(evt);
            }
        });

        JBfechar.setText("Fechar");
        JBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBfecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Relação Categoria/Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(JBatualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBfechar)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBatualizar)
                    .addComponent(JBfechar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBfecharActionPerformed

    private void JBatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBatualizarActionPerformed
        carregarDados();
    }//GEN-LAST:event_JBatualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrmRelacaoCategoriaProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBatualizar;
    private javax.swing.JButton JBfechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
