class RelatorioEstatistico extends RelatorioDecorator {
    public RelatorioEstatistico(Relatorio relatorio) {
        super(relatorio);
    }

    public void gerar() {
        relatorio.gerar();
        System.out.println("Adicionando estatísticas ao relatório...");
    }
}

