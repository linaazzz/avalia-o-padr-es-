class Maritimo extends Transporte {
    private double volumeCarga;

    public Maritimo(double volumeCarga) {
        this.volumeCarga = volumeCarga;
    }

    @Override
    public double calcularTarifa() {
        return volumeCarga * 5; // exemplo: R$5 por m³
    }
}