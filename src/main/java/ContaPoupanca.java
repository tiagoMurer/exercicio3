public class ContaPoupanca extends Conta {

    static double taxaRendimento;

    ContaPoupanca(String numconta, String titular) {
        super(numconta, titular);
    }

    private void aplicarRendimento(){
        double saldo = this.getSaldo();
        this.setSaldo(saldo + (saldo * taxaRendimento));
    }
}
