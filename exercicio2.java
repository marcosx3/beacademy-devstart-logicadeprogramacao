import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.print("Informe seu peso: ");
        float peso = in.nextFloat();
        System.out.print("Informe sua altura: ");
        float altura = in.nextFloat();
        double imc = peso / (Math.pow(altura,2));
        System.out.println("Seu nome é: " + nome + "\n" +
                "Seu peso: " + peso + "\n" +
                "Seu IMC e: " + imc);
    }
}
