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

    @Test
    public void excecaoParaNumeroContaNaoNumerico(){
        Conta conta = new Conta("1", "X");
        String n = "A1";
        try{
            conta.setNumconta(n);
        }catch(ExcecaoNumeroConta n){

        }
    }

    @Test
    public void excecaoParaSaldoNegativo(){
        Conta c = new Conta();

        double s = -1;

        try{
            c.setSaldo(s);
        }catch(ExcecaoSaldoNegativo s){

        }
    }


}