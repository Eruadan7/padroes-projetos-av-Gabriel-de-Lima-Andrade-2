public class DocumentoFiscalChile implements iDocumentoFiscal {
    @Override
    public String gerar(Double valor) {
        double iva = valor * 0.19;
        return "Boleta eletrónica com iva de 19%: R$ " + String.format("%.2f", iva);
    }
}
