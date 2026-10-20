public class FabricaFerroviaria implements iFabricaPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade, temComprovanteReserva;

    public FabricaFerroviaria(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade,
            boolean temComprovanteReserva) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
        this.temComprovanteReserva = temComprovanteReserva;
    }


    @Override
    public iPassagem criarPassagem() {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa, temDocumentoIdentidade, temComprovanteReserva);
    }
}
