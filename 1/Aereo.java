class Aereo extends Transporte {
    private double pesoCarga;

    public Aereo(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularTarifa() {
        return pesoCarga * 10; // exemplo: R$10 por kg
    }
}
