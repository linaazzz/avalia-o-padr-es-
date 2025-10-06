public class Main {
    public static void main(String[] args) {
        Curriculo modelo = new Curriculo("Modelo padrão de currículo");
        Curriculo copia = (Curriculo) modelo.clonar();
        copia.personalizar("João");

        copia.mostrar();
    }
}