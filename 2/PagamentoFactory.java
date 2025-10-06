class PagamentoFactory {
    public static Pagamento criarPagamento(String tipo) {
        switch(tipo.toLowerCase()) {
            case "cartao": return new CartaoCredito();
            case "boleto": return new Boleto();
            case "pix": return new Pix();
            default: throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
    }
}