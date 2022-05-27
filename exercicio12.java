import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tabuada com While");
        System.out.print("Informe o numero: ");
        int num = in.nextInt();
        int n = 0;
        while (n <=9){
            n++;
            System.out.println(num + " x "  + n + " = " +num*n);

        }
    }
}
