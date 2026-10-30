package padroescomportamentais.strategy;

public class PagamentoPix implements FormaDePagamento {
    @Override
    public float processarPagamento(float valor) {
        // Exemplo: oferece 10% de desconto para pagamento à vista
        return valor - (valor * 0.10f);
    }
}