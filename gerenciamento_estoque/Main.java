// Main.java
import auth.Usuarios;
import java.util.Scanner;

public class Main {
    private static Usuarios[] usuarios = {
        new Usuarios("admin", "admin123"),
        new Usuarios("user", "user123")
    };

    private static Estoque estoque = new Estoque();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (autenticarUsuario()) {
            boolean continuar = true;
            while (continuar) {
                exibirMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        adicionarProduto();
                        break;
                    case 2:
                        editarProduto();
                        break;
                    case 3:
                        removerProduto();
                        break;
                    case 4:
                        listarProdutos();
                        break;
                    case 5:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        } else {
            System.out.println("Autenticação falhou!");
        }
    }

    private static boolean autenticarUsuario() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Usuarios usuario : usuarios) {
            if (usuario.autenticar(username, password)) {
                return true;
            }
        }
        return false;
    }

    private static void exibirMenu() {
        System.out.println("\nGerenciamento de Estoque:");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Editar Produto");
        System.out.println("3. Remover Produto");
        System.out.println("4. Listar Produtos");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarProduto() {
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição do Produto: ");
        String descricao = scanner.nextLine();
        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        Produtos produto = new Produtos(nome, descricao, preco);
        estoque.adicionarProduto(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void editarProduto() {
        System.out.print("Nome do Produto a ser editado: ");
        String nome = scanner.nextLine();
        System.out.print("Novo Nome do Produto: ");
        String novoNome = scanner.nextLine();
        System.out.print("Nova Descrição do Produto: ");
        String novaDescricao = scanner.nextLine();
        System.out.print("Novo Preço do Produto: ");
        double novoPreco = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        estoque.editarProduto(nome, novoNome, novaDescricao, novoPreco);
        System.out.println("Produto editado com sucesso!");
    }

    private static void removerProduto() {
        System.out.print("Nome do Produto a ser removido: ");
        String nome = scanner.nextLine();
        estoque.removerProduto(nome);
        System.out.println("Produto removido com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("\nProdutos no Estoque:");
        estoque.listarProdutos();
    }
}
