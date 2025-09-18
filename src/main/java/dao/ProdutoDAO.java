package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {

    public ArrayList<Produto> minhaLista = new ArrayList<>();

    /**
     * Retorna a Lista de Produtos.
     * @return 
     */
    public ArrayList<Produto> getMinhaLista() {

        minhaLista.clear();

        try {
            Statement stmt = ConexaoDB.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produto");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                double precoUnitario = res.getDouble("preco_unitario");
                String unidade = res.getString("unidade");
                int quantidadeEstoque = res.getInt("quantidade_estoque");
                int quantidadeMin = res.getInt("quantidade_min");
                int quantidadeMax = res.getInt("quantidade_max");
                int categoriaId = res.getInt("categoria_id");

                Produto objeto = new Produto(id, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMin, quantidadeMax, categoriaId);

                minhaLista.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return minhaLista;
    }

    public void setMinhaLista(ArrayList<Produto> minhaLista) {
        this.minhaLista = minhaLista;
    }

    /**
     * Retorna o maior id de um produto.
     * @return 
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDB.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) as id FROM produto");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    /**
     * Insere um novo produto no banco de dados.
     * @param objeto
     * @return 
     */
    public boolean insertProdutoBD(Produto objeto) {
        String sql = "INSERT INTO produto(id, nome, preco_unitario, unidade, quantidade_estoque, quantidade_min, quantidade_max, categoria_id) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = ConexaoDB.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setDouble(3, objeto.getPrecoUnitario());
            stmt.setString(4, objeto.getUnidade());
            stmt.setInt(5, objeto.getQuantidadeEstoque());
            stmt.setInt(6, objeto.getQuantidadeMin());
            stmt.setInt(7, objeto.getQuantidadeMax());
            stmt.setInt(8, objeto.getCategoriaId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Deleta um produto específico pelo seu ID.
     * @param id
     * @return 
     */
    public boolean deleteProdutoBD(int id) {
        try {
            Statement stmt = ConexaoDB.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM produto WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    /**
     * Atualiza os dados de um produto específico.
     * @param objeto
     * @return 
     */
    public boolean updateProdutoBD(Produto objeto) {
        String sql = "UPDATE produto SET nome = ?, preco_unitario = ?, unidade = ?, quantidade_estoque = ?, quantidade_min = ?, quantidade_max = ?, categoria_id = ? WHERE id = ?";

        try {
            PreparedStatement stmt = ConexaoDB.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setDouble(2, objeto.getPrecoUnitario());
            stmt.setString(3, objeto.getUnidade());
            stmt.setInt(4, objeto.getQuantidadeEstoque());
            stmt.setInt(5, objeto.getQuantidadeMin());
            stmt.setInt(6, objeto.getQuantidadeMax());
            stmt.setInt(7, objeto.getCategoriaId());
            stmt.setInt(8, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Carrega um produto pelo ID.
     * @param id
     * @return 
     */
    public Produto carregaProduto(int id) {
        Produto objeto = new Produto();
        objeto.setId(id);
        try {
            Statement stmt = ConexaoDB.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM produto WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setPrecoUnitario(res.getDouble("preco_unitario"));
            objeto.setUnidade(res.getString("unidade"));
            objeto.setQuantidadeEstoque(res.getInt("quantidade_estoque"));
            objeto.setQuantidadeMin(res.getInt("quantidade_min"));
            objeto.setQuantidadeMax(res.getInt("quantidade_max"));
            objeto.setCategoriaId(res.getInt("categoria_id"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return objeto;
    }
    
    public Produto getProdutoPorNome(String nome) {
        Produto produto = null;
        try {
            Connection conn = ConexaoDB.getConexao();
            String sql = "SELECT * FROM produto WHERE nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("preco_unitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                produto.setQuantidadeMin(rs.getInt("quantidade_min"));
                produto.setQuantidadeMax(rs.getInt("quantidade_max"));
                produto.setCategoriaId(rs.getInt("categoria_id"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar produto por nome: " + e.getMessage());
        }
        return produto;
    }
}