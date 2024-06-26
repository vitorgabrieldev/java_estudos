// src/java/Produtos.java
public class Produtos {
    private String nome;
    private String descricao;
    private double preco;

    public Produtos(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Descrição do Produto: " + descricao);
        System.out.println("Preço do Produto: " + preco);
    }
}
