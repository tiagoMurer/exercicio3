import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaTest {

    @Test
    public void deveTransferirdeContaParaConta() {
        Conta conta = new Conta("2312", "Joao");
        conta.setSaldo(3);
        Conta outraconta = new Conta("2313", "Maria");

        conta.transferirPara(outraconta, 3.0);

        Assert.assertEquals(3.0, outraconta.getSaldo(), 0);
    }

    @Test
    public void deveAplicarValorASaldo() {
        Conta conta = new Conta("2312", "Joao");
        conta.depositar(3);

        Assert.assertEquals(3.0, conta.getSaldo(), 0);

    }

    @Test
    public void deveRetirarValordeSaldo() {
        Conta conta = new Conta("2312", "Joao");
        conta.setSaldo(3);
        conta.sacar(3);

        Assert.assertEquals(0, conta.getSaldo(), 0);
    }
}