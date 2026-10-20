public class FabricaRodoviaria implements iFabricaPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade;


    public FabricaRodoviaria(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
    }

    @Override
    public iPassagem criarPassagem() {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa, temDocumentoIdentidade);
    }
}
