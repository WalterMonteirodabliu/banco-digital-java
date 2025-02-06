public interface IConta {
  
    void sacar(double valor);

    void depositar(double valor);

    void transferir(IConta Contadestino, double valor);

    void imprimirExtrato();

}
