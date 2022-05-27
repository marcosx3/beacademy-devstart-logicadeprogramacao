import java.util.*;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] produtos= new String[3];

        String valor;
        String nome;
        for(int i=0;i<3;i++) {
            System.out.print("Informe o nome> ");
            nome = in.nextLine();
            System.out.print("Informe o valor> ");
            valor = in.nextLine();
            String p = nome + " = " + valor;
            produtos[i] = p;
        }
        for(int i=0;i<3;i++){
            System.out.println(produtos[i]);
        }


    }
}
