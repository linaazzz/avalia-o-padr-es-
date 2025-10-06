class Terrestre extends Transporte {
    private double distanciaKm;

    public Terrestre(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularTarifa() {
        return distanciaKm * 2; // exemplo: R$2 por km
    }
}