public class PassagemAerea implements iPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade, temBilheteEletronico;

    public PassagemAerea(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade,
            boolean temBilheteEletronico) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
        this.temBilheteEletronico = temBilheteEletronico;
    }

    @Override
    public Double getTaxaEmbarque() {
        return valorTarifa * 0.08;
    }

    @Override
    public String getResumo() {
        if (temDocumentoIdentidade && temBilheteEletronico) {
            return "Nome: "+nomePassageiro+"\n"+"Modal: Aéreo\n"+
            "Taxa de Embarque:"+getTaxaEmbarque()+"\n"+"Documentos exigidos: Documento de identidade e Bilhete eletrônico";
        } return "Passagem negada. Documentos exigidos: Documento de identidade e Bilhete eletrônico";
    }
}
