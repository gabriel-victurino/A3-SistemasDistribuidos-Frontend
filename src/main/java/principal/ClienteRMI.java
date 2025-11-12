package principal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import modelo.Categoria;
import servicos.ServicoCategoria;
import servicos.ServicoProduto;
import servicos.ServicoMovimentacao;
import java.util.ArrayList;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Endereço e porta do servidor RMI
            String host = "localhost";
            int porta = 1099;

            // Conecta ao registro RMI
            Registry registro = LocateRegistry.getRegistry(host, porta);
            System.out.println("Conectado ao servidor RMI em " + host + ":" + porta);

            // Obtém referências aos serviços registrados
            ServicoCategoria servicoCategoria = (ServicoCategoria) registro.lookup("ServicoCategoria");
            ServicoProduto servicoProduto = (ServicoProduto) registro.lookup("ServicoProduto");
            ServicoMovimentacao servicoMovimentacao = (ServicoMovimentacao) registro.lookup("ServicoMovimentacao");

            System.out.println("\n Testando ServicoCategoria:");
            ArrayList<Categoria> categorias = servicoCategoria.listarCategorias();
            for (Categoria c : categorias) {
                System.out.println(" - " + c.getIdCategoria() + " | " + c.getNome());
            }

            System.out.println("\n Conexão e listagem bem-sucedidas!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar ou executar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
