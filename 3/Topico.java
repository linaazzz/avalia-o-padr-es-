import java.util.*;

class Topico {
    private String nome;
    private List<Leitor> leitores = new ArrayList<>();

    public Topico(String nome) { this.nome = nome; }

    public void inscrever(Leitor leitor) { leitores.add(leitor); }
    public void remover(Leitor leitor) { leitores.remove(leitor); }

    public void publicarNoticia(String noticia) {
        for (Leitor l : leitores) {
            l.atualizar(noticia);
        }
    }
}