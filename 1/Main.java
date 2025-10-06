public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Terrestre(100);
        Transporte t2 = new Aereo(50);
        Transporte t3 = new Maritimo(200);

        System.out.println("Tarifa terrestre: " + t1.calcularTarifa());
        System.out.println("Tarifa aérea: " + t2.calcularTarifa());
        System.out.println("Tarifa marítima: " + t3.calcularTarifa());
    }
}