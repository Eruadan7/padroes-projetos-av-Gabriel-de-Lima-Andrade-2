public class FabricaBr implements iFabricaMatricula {
    @Override
    public iDocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBr();
    }

    @Override
    public iComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaBr();
    }

    @Override
    public iProcessoPagamento criarProcessoPagamento() {
        return new ProcessoPagamentoBr();
    }
}
