import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler;

        ler = new Scanner(new File("src/Lista_URL.txt"));
        Scanner scanner = new Scanner(System.in);

        Stack pilha = new Stack();

        while (ler.hasNextLine()) {
            pilha.push(ler.nextLine());
        }
        System.out.print("Imprimindo de links " + pilha + " ");

        System.out.println("\n Digite o link a ser excluido: ");
        String excluir = scanner.nextLine();

        if (pilha.contains(excluir)){
            pilha.remove(excluir);
        }
        else{
            System.out.println("Link inexistente !");
        }
        System.out.println("Histórico de links (mais recente) " + pilha.size());
        System.out.println("Imprimindo links atualizados " + pilha);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o link a ser consultado: ");
        String consulta = scanner2.nextLine();

        if (pilha.contains(consulta)){
            System.out.println("Link encontrado no histórico.");
        }
        else {
            System.out.println("Link não Encontrado");
        }

    }
}