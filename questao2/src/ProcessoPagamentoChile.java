public class ProcessoPagamentoChile implements iProcessoPagamento{
    @Override
    public String processar() {
        return "pagamento via Webpay";
    }
}
