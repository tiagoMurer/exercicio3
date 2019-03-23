public class ContaCorrente extends Conta{

    static double taxaChequeEspecial;
    private double limiteChequeEspecial;

    ContaCorrente(String numconta, String titular) {
        super(numconta, titular);
    }

    private void debitarJuros(){
        double saldo = this.getSaldo();
        this.setSaldo(saldo - (saldo * taxaChequeEspecial));
    }

    @Override
    public void sacar(double valor){
        double saldo = this.getSaldo();
        this.setSaldo(saldo - (valor + 0.01 * saldo));
    }

}
