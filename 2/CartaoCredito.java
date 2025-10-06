class CartaoCredito implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagando R$" + valor + " com cartão de crédito.");
    }
}