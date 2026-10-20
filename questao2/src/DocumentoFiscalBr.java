public class DocumentoFiscalBr implements iDocumentoFiscal {
    @Override
    public String gerar(Double valor) {
       double iss = valor * 0.05;
        return "NFS-e com ISS de 5%: R$ " + String.format("%.2f", iss);
    }
}
