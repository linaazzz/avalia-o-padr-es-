public class Main {
    public static void main(String[] args) {
        Relatorio rel = new RelatorioBasico();
        Relatorio relComStats = new RelatorioEstatistico(rel);

        relComStats.gerar();
    }
}