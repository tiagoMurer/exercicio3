import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaPoupancaTest {
    @Test
    public void deveAplicarRendimentoAoSaldo(){
        ContaPoupanca conta = new ContaPoupanca("2312", "Joao");
        conta.setSaldo(100.0);
        conta.setTaxaRendimento(0.05);
        conta.aplicarRendimento();

        Assert.assertEquals(105.0, conta.getSaldo(), 0);
    }
}