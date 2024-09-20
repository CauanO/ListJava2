import java.util.Scanner;

public class ListFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidades de maças desejadas: ");
        int qtdMacas = sc.nextInt();
        if (qtdMacas < 12) {
            double totalAbaixo = qtdMacas * 0.30;
            System.out.printf("Quantidade de maças: %d ", qtdMacas);
            System.out.printf("Valor: %.2f", totalAbaixo);
        } else {
            double totalAcima = qtdMacas * 0.25;
            System.out.printf("Quantidade de maças: %d ", qtdMacas);
            System.out.printf("Valor: %.2f", totalAcima); 
        }
    }
}
