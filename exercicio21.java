import java.util.Scanner;

public class exercicio21 {
    static class Usuario {
        private String nome;
        private String cpf;
        private String rg;

        public Usuario(String nome, String cpf, String rg, String endereco) {
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        private String endereco;
    }
    public static void main(String[] args) {
     //    public Usuario(String nome, String cpf, String rg, String endereco)
        Scanner in = new Scanner(System.in);
        Usuario u1 = new Usuario("Joca","0554451212","36987745","Rua dos anjos");
        Usuario u2 = new Usuario("Pedro","6578448844","6655974","Rua dos Cascados");
        Usuario u3 = new Usuario("Paula","112445124","111212312","Rua dos Lisos");
        Usuario u4 = new Usuario("Lidia","9989885563","36565325","Rua dos Brabo");
        Usuario u5 = new Usuario("Jao","74631414","87454587","Rua dos Alfajors");
    }
}
