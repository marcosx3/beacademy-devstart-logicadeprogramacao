import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float saldo = 1000;
        float ret;
        do{
            System.out.print("Informe a retirada: ");
            ret = in.nextFloat();
            saldo -= ret;
        } while(saldo >=0);
        System.out.println("Saldo menor que 0!");
    }
}
