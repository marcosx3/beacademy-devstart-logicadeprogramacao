import java.util.Scanner;

public class exercicio3 {

    private static void Comparacoes(byte idade,String nome){
       String maior18 = "verdadeiro";
       String diferente25 = "falso";
       String nomeEidade = "verdadeiro";
       String nomeOUidade = "falso";
       String idadePorDois = "falso";
       if (idade < 18){
           maior18 = "falso";
       }
        if(idade != 25){
            diferente25 = "verdadeiro";
        }
        if(idade != 25 && nome.equalsIgnoreCase("Marcos")){
                nomeEidade = "falso";
        }
        if(idade !=25 || nome.equalsIgnoreCase("Marcos")){
            nomeOUidade = "verdadeiro";
        }
        if(idade /2 == 0){
                idadePorDois = "verdadeiro";
        }
        System.out.println("1: " + maior18 + "\n" + "2: " + diferente25 + "\n" +
                "3: "+ nomeEidade + "\n" + "4: " + nomeOUidade + "\n" + "5: "+ idadePorDois);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.print("Informe sua idade: ");
        byte idade = in.nextByte();
        Comparacoes(idade,nome);

    }
}
