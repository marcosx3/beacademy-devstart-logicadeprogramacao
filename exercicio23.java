import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] M = new double[12][12];
        double soma = 0;
        String op = in.next();

        for (int i=0;i<12 ; i++) {
            for (int j=0;j < 12 ;j++ ) {
                M[i][j] = in.nextDouble();
            }
        }
        for (int i=0;i<=10 ; i++) {
            for (int j=0;j <= (10-i) ;j++ ) {
                soma +=M[i][j];
            }
        }
        if(op.equalsIgnoreCase("M")) {
            double media = soma / 66;
            System.out.println(String.format("%.1f",media));
        } else {
            System.out.println(String.format("%.1f",soma));
        }


    }
}
