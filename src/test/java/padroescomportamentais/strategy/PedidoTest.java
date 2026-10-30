package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    @Test
    void deveCalcularValorFinalComCartaoDeCredito() {
        Pedido pedido = new Pedido();
        pedido.pagarComCartao(100.0f);
        // 100 + 5% de taxa = 105.0
        assertEquals(105.0f, pedido.getValorFinal(), 0.001f);
    }

    @Test
    void deveCalcularValorFinalComPix() {
        Pedido pedido = new Pedido();
        pedido.pagarComPix(100.0f);
        // 100 - 10% de desconto = 90.0
        assertEquals(90.0f, pedido.getValorFinal(), 0.001f);
    }

    @Test
    void deveCalcularValorFinalComBoleto() {
        Pedido pedido = new Pedido();
        pedido.pagarComBoleto(100.0f);
        // 100 + 2.50 de taxa fixa = 102.5
        assertEquals(102.5f, pedido.getValorFinal(), 0.001f);
    }
}