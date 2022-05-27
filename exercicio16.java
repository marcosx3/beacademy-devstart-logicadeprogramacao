import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Juntando Idades com While");
        int idade = 998;
        int menor18 = 0;
        int maior60 = 0;
        while(idade != -99){
            System.out.print("Informe idade: ");
            idade = in.nextInt();
            if(idade <18){
                menor18++;
            } else if(idade >60){
                maior60++;
            }
        }
        System.out.println("Abaixo de 18: " + menor18);
        System.out.println("Acima de 60: " + maior60);
    }
}
