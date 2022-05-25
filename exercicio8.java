import java.util.Scanner;

public class exercicio8 {
    private static Double operacoes(byte op, Double a,Double b){
       Double resul = 0.0;
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
        System.out.print("Informe o A: ");
        Double a = in.nextDouble();
        System.out.print("Informe o B: ");
        Double b = in.nextDouble();
        System.out.println("1 - Adicao\n2 - Subtracao\n3- Multiplicacao\n4 - Divisao");
        System.out.print("Escolha a Opcao: ");
        byte op = in.nextByte();
        System.out.println("Seu resultado: "+ operacoes(op,a,b));
        in.close();
    }
}
