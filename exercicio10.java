import java.util.Scanner;

public class exercicio10 {
    public static void calculadora(int num ){
        for (int i=1;i<=10;i++){
            System.out.println(num + "x" + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos para a Tabuada!!!");
        System.out.print("Escolha um Numero: ");
        int num = in.nextInt();
        calculadora(num);

    }
}
