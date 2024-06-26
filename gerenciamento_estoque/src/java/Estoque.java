// src/java/Estoque.java
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produtos> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    public void editarProduto(String nome, String novoNome, String novaDescricao, double novoPreco) {
        for (Produtos produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setNome(novoNome);
                produto.setDescricao(novaDescricao);
                produto.setPreco(novoPreco);
                break;
            }
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produtos produto : produtos) {
                produto.mostrarInformacoes();
                System.out.println("-------------------");
            }
        }
    }
}
