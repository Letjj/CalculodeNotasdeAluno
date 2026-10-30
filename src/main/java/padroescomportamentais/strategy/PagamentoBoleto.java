package padroescomportamentais.strategy;

public class PagamentoBoleto implements FormaDePagamento {
    @Override
    public float processarPagamento(float valor) {
        // Exemplo: valor base + taxa fixa de emissão de boleto
        return valor + 2.50f;
    }
}