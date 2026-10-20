public class PassagemRodoviaria implements iPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade;
    
    public PassagemRodoviaria(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
    }

    @Override
    public Double getTaxaEmbarque() {
        return valorTarifa * 0.03;
    }

    @Override
    public String getResumo() {
        if (temDocumentoIdentidade) {
            return "Nome: "+nomePassageiro+"\n"+"Modal: Rodoviário\n"+
            "Taxa de Embarque:"+getTaxaEmbarque()+"\n"+"Documentos exigidos: Documento de identidade";
        } return "Passagem negada. Documentos exigidos: Documento de identidade";
    }
}
