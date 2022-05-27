import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] M = new double[12][12];

        char O = in.next().toUpperCase().charAt(0);

        double soma = 0, media = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i > j)
                    soma += M[i][j];
            }

        }
        media = soma / 12;
        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2;
        System.out.println(String.format("%.1f", soma));
    }
}
