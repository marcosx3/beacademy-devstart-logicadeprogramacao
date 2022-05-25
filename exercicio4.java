import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double valor = 0.0;
        System.out.println("Valor em conta atualmente: " + valor);
        System.out.print("Informe o valor: ");
        Double informado = in.nextDouble();
            valor = informado;
        System.out.println("Valor atualizado para: "+valor);
    }
}
