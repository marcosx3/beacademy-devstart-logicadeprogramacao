import java.util.Scanner;

public class exercicio6 {

    private static String classificacao(byte idade){
        String tamanho = "";
        if(idade < 18){
            tamanho = "Menor de Idade";
        }
        if(idade >= 18 && idade <= 60){
            tamanho = "Adulto";
        } else if(idade > 60){
            tamanho = "idoso";
        }
        return  tamanho;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        byte idade = in.nextByte();
        System.out.println("Sua classificacao é: " + classificacao(idade));;
    }
}
