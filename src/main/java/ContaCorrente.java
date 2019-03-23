public class ContaCorrente extends Conta{

    static double taxaChequeEspecial;
    private double limiteChequeEspecial;

    ContaCorrente(String numconta, String titular) {
        super(numconta, titular);
    }

    public void debitarJuros(){
        double saldo = this.getSaldo();
        this.setSaldo(saldo - (saldo * taxaChequeEspecial));
    }

    @Override
    public void sacar(double valor){
        double saldo = this.getSaldo();
        this.setSaldo(saldo - (valor + 0.01 * saldo));
    }


    //GETTERS + SETTERS

    public static double getTaxaChequeEspecial() {
        return taxaChequeEspecial;
    }

    public static void setTaxaChequeEspecial(double taxaChequeEspecial) {
        ContaCorrente.taxaChequeEspecial = taxaChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
