public class ContaPoupanca extends Conta {

    static double taxaRendimento;

    ContaPoupanca(String numconta, String titular) {
        super(numconta, titular);
    }

    public void aplicarRendimento(){
        double saldo = this.getSaldo();
        this.setSaldo(saldo + (saldo * taxaRendimento));
    }

    //GETTERS + SETTERS

    public static double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        ContaPoupanca.taxaRendimento = taxaRendimento;
    }
}
