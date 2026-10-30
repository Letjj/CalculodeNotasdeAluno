package padroescomportamentais.strategy;

public class PagamentoCartaoCredito implements FormaDePagamento {
    @Override
    public float processarPagamento(float valor) {
        // Exemplo: adiciona 5% de taxa de processamento da operadora
        return valor + (valor * 0.05f);
    }
}