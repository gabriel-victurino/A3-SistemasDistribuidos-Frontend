package principal;

import cliente.ConexaoRMI;
import visao.FrmMenuPrincipal;

public class Principal {
    
    public static void main(String[] args) {
        
        // Testa conexão ANTES de abrir interface
        if (!ConexaoRMI.conectar()) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Não foi possível conectar ao servidor RMI!\n" +
                    "Verifique se o servidor está ativo.",
                    "Erro de Conexão",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Conectou → abre o menu
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMenuPrincipal().setVisible(true);
        });
    }
}