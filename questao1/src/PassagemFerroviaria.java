public class PassagemFerroviaria implements iPassagem {
    private String nomePassageiro;
    private Double valorTarifa;
    private boolean temDocumentoIdentidade, temComprovanteReserva;
  

    public PassagemFerroviaria(String nomePassageiro, Double valorTarifa, boolean temDocumentoIdentidade,
            boolean temComprovanteReserva) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
        this.temDocumentoIdentidade = temDocumentoIdentidade;
        this.temComprovanteReserva = temComprovanteReserva;
    }

    @Override
    public Double getTaxaEmbarque() {
        return valorTarifa * 0.05;
    }

    @Override
    public String getResumo() {
        if (temDocumentoIdentidade && temComprovanteReserva) {
            return "Nome: "+nomePassageiro+"\n"+"Modal: Ferroviário\n"+
            "Taxa de Embarque:"+getTaxaEmbarque()+"\n"+"Documentos exigidos: Documento de identidade e Comprovante de Reserva";
        } return "Passagem negada. Documento de identidade e Comprovante de Reserva";
    }
}
