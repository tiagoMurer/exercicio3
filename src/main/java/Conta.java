import java.util.Objects;

public class Conta {
    private String numconta;
    private String titular;
    private double saldo;

    public Conta(String numconta, String titular){
        this.numconta = numconta;
        this.titular = titular;
        this.saldo = 0;
    }


    protected void transferirPara(Conta outraconta, double valor){
        this.saldo -= valor;
        outraconta.saldo += valor;
    }

    protected void depositar(double valor){
        this.saldo += valor;
    }

    protected void sacar(double valor){
        this.saldo -= valor;
    }


    //EQUALS+HASHCODE OVERRIDE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numconta, conta.numconta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numconta);
    }


    //TOSTRING OVERRIDE

    @Override
    public String toString() {
        return "Conta{" +
                "numconta='" + numconta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //GETTERS + SETTERS
    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
