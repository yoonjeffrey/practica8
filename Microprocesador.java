public class Microprocesador extends ComponenteElectronico {
    private final int cacheRAM;
    private final long velocidadHz;

    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, int cacheRAM, long velocidadHz) {
        super(fabricante, numeroSerie, marca, nombre);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" +
                "cacheRAM=" + cacheRAM +
                ", velocidadHz=" + velocidadHz +
                ", " + super.toString() +
                '}';
    }
}
