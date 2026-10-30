package padroescomportamentais.strategy;

public class ProcessadorPagamento {
    private float valorBase;

    public ProcessadorPagamento(float valorBase) {
        this.valorBase = valorBase;
    }

    public float processar(FormaDePagamento formaDePagamento) {
        return formaDePagamento.processarPagamento(valorBase);
    }
}