import java.util.Scanner;

public class exercicio7 {
    static class  Conta {
        private Double saldo = 0.0;

        public Double getSaldo() {
            return saldo;
        }
        public void deposito(Double saldo) {
            this.saldo += saldo;
        }
        public void saque(Double saldo) {
            this.saldo -= saldo;
        }

    }
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner in = new Scanner(System.in);
        Double valor = 0.0;
        byte op;
        System.out.println("Valor em conta: " + conta.getSaldo());
        System.out.print("1 - Saque  2 - Deposito");
        System.out.print("Escolha a operacao: ");
        op = in.nextByte();
            //deposito valor
            if(op == 1){
                System.out.print("Valor a sacar: ");
                valor = in.nextDouble();
                conta.saque(valor);
                System.out.println("Voce Escolheu Sacar!");
                System.out.println("Novo valor em conta: " + conta.getSaldo());
            }else if(op == 2){
                System.out.print("Valor a Depositar: ");
                valor = in.nextDouble();
                conta.deposito(valor);
                System.out.println("Voce Escolheu Depositar!");
                System.out.println("Novo valor em conta: " + conta.getSaldo());
            }

        System.out.println("Valor atualizado para: "+valor);
    }
}
