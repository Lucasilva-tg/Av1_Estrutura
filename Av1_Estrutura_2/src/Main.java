import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[40][40];

        int xampu = 0, condicionador = 0, hidratante = 0, tintura = 0, demaquilante = 0;

        System.out.println("Entre com os códigos do produto: ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1){
                    xampu++;
                }
                if (mat[i][j] == 2){
                    condicionador++;
                }
                if (mat[i][j] == 3){
                    hidratante++;
                }
                if (mat[i][j] == 4){
                    tintura++;
                }
                if (mat[i][j] == 5){
                    demaquilante++;
                }
            }
        }
        System.out.println("Quantidade de Xampu: " + xampu + ", Quantidade de Condicionador: " + condicionador +
                ", Quantidade de hidratante: " + hidratante + ", Quantidade de Tintura: " + tintura + ", Quantidade de demaquilante: " + demaquilante);
    }
}