public class FabricaChile implements iFabricaMatricula {
    @Override
    public iDocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }

    @Override
    public iComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaChile();
    }

    @Override
    public iProcessoPagamento criarProcessoPagamento() {
        return new ProcessoPagamentoChile();
    }
}
