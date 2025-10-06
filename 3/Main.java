public class Main {
    public static void main(String[] args) {
        Topico tecnologia = new Topico("Tecnologia");

        Leitor l1 = new LeitorConcreto("Alice");
        Leitor l2 = new LeitorConcreto("Bob");

        tecnologia.inscrever(l1);
        tecnologia.inscrever(l2);

        tecnologia.publicarNoticia("Novo smartphone lançado!");
    }
}