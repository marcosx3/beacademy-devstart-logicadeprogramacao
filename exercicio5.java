import java.util.Scanner;

public class exercicio5 {

    private static  String IMC(float altura, float peso ){
        String tipoIMC = "";
        Double imc = peso / (Math.pow(altura,2));
        if(imc < 19){
            tipoIMC = "Abaixo do Peso";
        } else if(imc >= 19 && imc < 25){
            tipoIMC = "Peso Normal";
        } else if(imc >=25 && imc < 30){
            tipoIMC = "Sobrepeso";
        } else if(imc >=30 && imc < 40){
            tipoIMC = "Obesidade tipo 1";
        } else if(imc >= 40){
            tipoIMC = "Obsedidade Morbida";
        }
        return tipoIMC;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a Altura: ");
        float altura = in.nextFloat();
        System.out.print("Informe o Peso: ");
        float peso = in.nextFloat();

        System.out.println("Seu IMC é : " + IMC(altura,peso));
    }
}
