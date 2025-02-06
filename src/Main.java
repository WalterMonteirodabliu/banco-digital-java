public class Main {
    public static void main(String[] args) {

        Cliente walter = new Cliente();
        walter.setNome("Walter");

        Conta cc = new ContaCorrente(walter);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(walter);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
