
package visao;


public class FrmRelatoriosGerenciais extends javax.swing.JFrame {


    public FrmRelatoriosGerenciais() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBbalancoFisicoFinanceiro = new javax.swing.JButton();
        JBprodutosAcimaQntMax = new javax.swing.JButton();
        JBlistaPrecos = new javax.swing.JButton();
        JBprodutosAbaixoQntMin = new javax.swing.JButton();
        JBrelacaoCategoriaProduto = new javax.swing.JButton();
        JBvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatórios Gerenciais");

        JBbalancoFisicoFinanceiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBbalancoFisicoFinanceiro.setText("Balanço Físico/Financeiro");
        JBbalancoFisicoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbalancoFisicoFinanceiroActionPerformed(evt);
            }
        });

        JBprodutosAcimaQntMax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBprodutosAcimaQntMax.setText("Produtos Acima da Qnt. Max.");
        JBprodutosAcimaQntMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprodutosAcimaQntMaxActionPerformed(evt);
            }
        });

        JBlistaPrecos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBlistaPrecos.setText("Lista de Preços");
        JBlistaPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlistaPrecosActionPerformed(evt);
            }
        });

        JBprodutosAbaixoQntMin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBprodutosAbaixoQntMin.setText("Produtos Abaixo da Qnt. Min.");
        JBprodutosAbaixoQntMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprodutosAbaixoQntMinActionPerformed(evt);
            }
        });

        JBrelacaoCategoriaProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBrelacaoCategoriaProduto.setText("Relação Categoria/Produto");
        JBrelacaoCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrelacaoCategoriaProdutoActionPerformed(evt);
            }
        });

        JBvoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBvoltar.setText("Voltar");
        JBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBbalancoFisicoFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(JBlistaPrecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBprodutosAcimaQntMax)
                            .addComponent(JBprodutosAbaixoQntMin))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JBrelacaoCategoriaProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBbalancoFisicoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBprodutosAcimaQntMax, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBprodutosAbaixoQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBlistaPrecos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBrelacaoCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbalancoFisicoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbalancoFisicoFinanceiroActionPerformed
        FrmBalancoFisicoFinanceiro balanco = new FrmBalancoFisicoFinanceiro();
        balanco.setVisible(true);
    }//GEN-LAST:event_JBbalancoFisicoFinanceiroActionPerformed

    private void JBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBvoltarActionPerformed

    private void JBprodutosAbaixoQntMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprodutosAbaixoQntMinActionPerformed
        FrmProdutosAbaixoQtdMin relatorioMinimo = new FrmProdutosAbaixoQtdMin();
        relatorioMinimo.setVisible(true);
    }//GEN-LAST:event_JBprodutosAbaixoQntMinActionPerformed

    private void JBprodutosAcimaQntMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprodutosAcimaQntMaxActionPerformed
        FrmProdutosAcimaQtdMax relatoriomaximo = new FrmProdutosAcimaQtdMax();
        relatoriomaximo.setVisible(true);
    }//GEN-LAST:event_JBprodutosAcimaQntMaxActionPerformed
    
    
    private void JBrelacaoCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrelacaoCategoriaProdutoActionPerformed
         FrmRelacaoCategoriaProduto relatorio = new FrmRelacaoCategoriaProduto();
        relatorio.setVisible(true);
    }//GEN-LAST:event_JBrelacaoCategoriaProdutoActionPerformed

    private void JBlistaPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlistaPrecosActionPerformed
         FrmListaDePreços listaPrecos = new FrmListaDePreços();
        listaPrecos.setVisible(true);
    }//GEN-LAST:event_JBlistaPrecosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRelatoriosGerenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatoriosGerenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatoriosGerenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatoriosGerenciais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatoriosGerenciais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbalancoFisicoFinanceiro;
    private javax.swing.JButton JBlistaPrecos;
    private javax.swing.JButton JBprodutosAbaixoQntMin;
    private javax.swing.JButton JBprodutosAcimaQntMax;
    private javax.swing.JButton JBrelacaoCategoriaProduto;
    private javax.swing.JButton JBvoltar;
    // End of variables declaration//GEN-END:variables
}
