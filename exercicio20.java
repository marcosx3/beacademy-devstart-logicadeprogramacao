import java.util.Scanner;

public class exercicio20 {
    static class Aluno {
        private String nome;
        private float nota1;
        private float nota2;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getNota1() {
            return nota1;
        }

        public float getNota2() {
            return nota2;
        }

        public void setNota2(float nota2) {
            this.nota2 = nota2;
        }

        public void setNota1(float nota1) {
            this.nota1 = nota1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome: ");
        aluno.setNome(in.nextLine());
        System.out.println("");
        System.out.print("Informe nota  1: ");
        aluno.setNota1(in.nextFloat());
        System.out.print("Informe nota  2: ");
        aluno.setNota2(in.nextFloat());
        double media = (aluno.getNota1() + aluno.getNota2()) / 2;
        System.out.println("Nome: "+ aluno.getNome());
        System.out.println("Media: "+ media);
        if(media <6){
            System.out.println("Aluno Reprovado!");
        } else {
            System.out.println("Aluno Aprovado!");
        }
    }
}
