import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome da tabela para a classe Cliente: ");
        String nomeTabela = scanner.nextLine();


        System.out.println("\nNome da Tabela configurada pelo usuário:");
        System.out.println("Classe Cliente -> Tabela: " + nomeTabela);


        exibirClienteComTabela(nomeTabela);

        scanner.close();
    }


    public static void exibirClienteComTabela(String nomeTabela) {
        System.out.println("\nCriando um cliente associado à tabela: " + nomeTabela);
        Cliente cliente = new Cliente(1, "João Silva");
        System.out.println(cliente);
        System.out.println("Este cliente pertence à tabela '" + nomeTabela + "'");
    }
}
