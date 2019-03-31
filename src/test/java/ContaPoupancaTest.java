import org.junit.Assert;
import org.junit.Test;

public class ContaPoupancaTest {
    @Test
    public void deveAplicarRendimentoAoSaldo(){
        ContaPoupanca conta = new ContaPoupanca("2312", "Joao");
        conta.setSaldo(100.0);
        conta.setTaxaRendimento(0.05);
        conta.aplicarRendimento();

        Assert.assertEquals(105.0, conta.getSaldo(), 0);
    }
    @Test
    void excecaoParaRendimentoNegativo(){
        ContaPoupanca cp = new ContaPoupanca("1234", "Joao");
        double r = -534.43;
        try{
            cp.setTaxaRendimento(r);
        }catch(ExcecaoValorAbsolutoNegativo){

        }
    }

}