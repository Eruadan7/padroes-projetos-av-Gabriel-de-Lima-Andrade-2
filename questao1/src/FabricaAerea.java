public class FabricaAerea implements iFabricaPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade, temBilheteEletronico;

    public FabricaAerea(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade,boolean temBilheteEletronico) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
        this.temBilheteEletronico = temBilheteEletronico;
    }

    @Override
    public iPassagem criarPassagem() {
        return new PassagemAerea(nomePassageiro, valorTarifa, temDocumentoIdentidade, temBilheteEletronico);
    }

}
