import java.util.Scanner;

public class exercicio14 {

    private static Double operacoes(byte op, Double a,Double b){
        double resul = 0.0;
        switch (op){
            case 1:
                resul = a + b;
                break;
            case 2:
                resul = b - a;
                break;
            case 3:
                resul = a * b;
                break;
            case 4:
                resul = a /b;
                break;
        }
        return resul;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = 1;
        while (op == 1){

            System.out.println("Operacoes!!!!");
            System.out.println("1 - Adicao\n 2 - Subtracao\n 3 - Multiplicacao\n 4 - divisao");
            System.out.print("Opcao: ");
            byte esc = in.nextByte();
            System.out.print("Numero A: ");
            double a = in.nextDouble();
            System.out.print("Numero B: ");
            double b = in.nextDouble();
            System.out.println("Resultado = "  +  operacoes(esc,a,b));
            System.out.println("-----------------------");
            System.out.print("Deseja continuar 1 - Y/ 2 - N: ");
            int opc = in.nextInt();
            if(opc == 1){
                op = 1;
            } else {
                op = 2;
            }

        }
    }
}
