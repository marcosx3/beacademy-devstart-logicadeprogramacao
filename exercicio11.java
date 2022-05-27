import java.util.Scanner;

public class exercicio11 {
        private static void multiplos(){
            for (int i=0;i<100;i++){
                if(i % 2 ==0){
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Multiplos de 2 de 0 a 100!!!");
        multiplos();
    }
}
