import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaCorrenteTest {
    @Test
    public void deveDebitarJurosdoSaldo(){
        ContaCorrente conta = new ContaCorrente("2312", "Joao");
        conta.setSaldo(100.0);
        conta.setTaxaChequeEspecial(0.05);

        conta.debitarJuros();

        Assert.assertEquals(95.0, conta.getSaldo(), 0);

    }

    @Test
    public void deveSacarComDescontoDe1Porcento(){
        ContaCorrente conta = new ContaCorrente("2312", "Joao");
        conta.setSaldo(100.0);

        conta.sacar(10.0);

        Assert.assertEquals(89.0, conta.getSaldo(), 0);
    }

}