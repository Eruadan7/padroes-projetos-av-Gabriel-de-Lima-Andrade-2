public class Consumidor {
    public static void consumir(iFabricaMatricula fabrica, Double valor) {
        iDocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        iProcessoPagamento processoPagamento = fabrica.criarProcessoPagamento();
        iComprovanteMatricula comprovanteMatricula = fabrica.criarComprovanteMatricula();

        System.out.println("=== " + fabrica.getClass().getSimpleName() + " ===");

        System.out.println("Documento Fiscal:");
        System.out.println(documentoFiscal.gerar(valor));

        System.out.println("Processo de Pagamento:");
        System.out.println(processoPagamento.processar());

        System.out.println("Comprovante de Matrícula:");
        System.out.println(comprovanteMatricula.imprimir());
    }
}
