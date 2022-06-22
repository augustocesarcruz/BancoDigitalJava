public class Main {
        public static void main(String[] args) {

                Cliente Augusto = new Cliente();
                Augusto.setNome("Augusto");

                Conta cc = new ContaCorrente(Augusto);
                Conta poupanca = new ContaPoupanca(Augusto);

                cc.depositar(300);
                cc.transferir(100, poupanca);

                cc.imprimirExtrato();
                poupanca.imprimirExtrato();

        }
}
