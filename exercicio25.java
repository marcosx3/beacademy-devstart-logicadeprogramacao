import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] M = new double[12][12];
        double soma = 0;
        String op;
        op = in.next();
        // put numbers in array
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j > M.length-i-1) soma += M[i][j];
            }
        }

        if(op.equalsIgnoreCase("M")) {
            double media = soma / 66.0;
            System.out.println(String.format("%.1f", media));
        } else {
            System.out.println(String.format("%.1f", soma));
        }
    }
}
