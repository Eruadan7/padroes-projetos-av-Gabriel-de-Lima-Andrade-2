public class ProcessoPagamentoBr implements iProcessoPagamento {
    @Override
    public String processar() {
        return "Pagamento via PIX";
    }
}
