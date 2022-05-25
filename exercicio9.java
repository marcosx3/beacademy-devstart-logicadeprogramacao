import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio9 {
    private static String quadrado() {
        Scanner in = new Scanner(System.in);
        Double area;
        System.out.println("Vamos Calcular area de um quadrado!!");
        System.out.print("Informe o lado: ");
        Double lado = in.nextDouble();
        area = Math.pow(lado,2);
        Double perimetro = lado * 4;
        String resul = " Area do  Quadrado: " + area +"\n Seu perimetro é: " + perimetro;
        in.close();
        return  resul;
    }
    private static String triangulo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos Calcular a area de um Triangulo!!");
        System.out.print("Informe o valor da base: ");
        Double base = in.nextDouble();
        System.out.print("Informe o valor da altura: ");
        Double altura = in.nextDouble();
        Double area  = (base * altura) / 2;
        String resul = "Area do Triangulo: " + area;
        in.close();
        return resul;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escolha 1- triangulo \n 2 - Quadrado: ");
        byte op = in.nextByte();
        switch (op){
            case 1:
                quadrado();
                break;
            case 2:
                triangulo();
                break;
        }
        in.close();
    }
}
