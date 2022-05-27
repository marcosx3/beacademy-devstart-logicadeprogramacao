import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Login com Do-While");
        String nome = "marcos";
        String senha = "1234";
        boolean login = false;
        do {
            System.out.print("Informe nome: ");
            String n = in.nextLine();
            System.out.print("Informe senha: ");
            String s = in.nextLine();

            if(n.equalsIgnoreCase(nome)&& s.equalsIgnoreCase(senha)){
                System.out.println("Login...Bem vindo!!");
                login = true;
            } else if(n.equalsIgnoreCase("-1")){
                System.out.println("Login cancelado pelo usuario");
                login = true;
            } else {
                login = false;
            }
        } while (!login);
    }
}
