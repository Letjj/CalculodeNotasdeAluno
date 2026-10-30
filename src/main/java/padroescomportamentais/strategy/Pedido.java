package padroescomportamentais.strategy;

public class Pedido {
    private float valorFinal;

    public float getValorFinal() {
        return valorFinal;
    }

    public void pagarComCartao(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.valorFinal = processador.processar(new PagamentoCartaoCredito());
    }

    public void pagarComPix(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.valorFinal = processador.processar(new PagamentoPix());
    }

    public void pagarComBoleto(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.valorFinal = processador.processar(new PagamentoBoleto());
    }
}