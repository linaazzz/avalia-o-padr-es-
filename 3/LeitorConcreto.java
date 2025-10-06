class LeitorConcreto implements Leitor {
    private String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    public void atualizar(String noticia) {
        System.out.println(nome + " recebeu a notícia: " + noticia);
    }
}