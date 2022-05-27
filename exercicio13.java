import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Validacao");
        String nome = "Marcos";
        String senha = "paylivre";
        boolean login = false;
        while (login != true){
            System.out.print("Informe o nome: ");
            String n = in.nextLine();
            System.out.print("Informe a senha: ");
            String s = in.nextLine();
            if(n.equalsIgnoreCase(nome) && s.equalsIgnoreCase(senha)){
                login = true;
                System.out.println("Login Feito, Bem Vindo!!");
            } else {
                System.out.println("Senha ou usuario errados!");
            }
        }
    }
}
