import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da tabela para a classe Cliente:");
        String nomeTabela = scanner.nextLine();

      
        Class<Cliente> clazz = Cliente.class;
        try {
            Annotation annotation = clazz.getAnnotation(Tabela.class);
            if (annotation != null) {
                Field nomeField = annotation.getClass().getDeclaredField("nome");
                nomeField.setAccessible(true);
                nomeField.set(annotation, nomeTabela);
            }
        } catch (Exception e) {
            System.err.println("Erro ao modificar a anotação: " + e.getMessage());
        }

        Tabela tabela = clazz.getAnnotation(Tabela.class);
        if (tabela != null) {
            System.out.println("A classe Cliente está associada à tabela: " + tabela.nome());
        } else {
            System.out.println("Anotação @Tabela não encontrada!");
        }

        scanner.close();
    }
}

