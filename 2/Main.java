public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = PagamentoFactory.criarPagamento("pix");
        pagamento.processarPagamento(150.0);
    }
}