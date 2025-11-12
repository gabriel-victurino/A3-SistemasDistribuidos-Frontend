package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servicos.ServicoCategoria;
import servicos.ServicoMovimentacao;
import servicos.ServicoProduto;

public class ConexaoRMI {

    private static ServicoCategoria servicoCategoria;
    private static ServicoProduto servicoProduto;
    private static ServicoMovimentacao servicoMovimentacao;

    public static void conectar() {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);

            servicoCategoria = (ServicoCategoria) registro.lookup("ServicoCategoria");
            servicoProduto = (ServicoProduto) registro.lookup("ServicoProduto");
            servicoMovimentacao = (ServicoMovimentacao) registro.lookup("ServicoMovimentacao");

            System.out.println("✅ Conectado ao servidor RMI com sucesso!");
        } catch (Exception e) {
            System.err.println("❌ Erro ao conectar ao servidor RMI: " + e.getMessage());
        }
    }

    public static ServicoCategoria getServicoCategoria() {
        return servicoCategoria;
    }

    public static ServicoProduto getServicoProduto() {
        return servicoProduto;
    }

    public static ServicoMovimentacao getServicoMovimentacao() {
        return servicoMovimentacao;
    }
}
