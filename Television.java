public class Television extends DispositivoElectronicoDeConsumo {
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "Television{" +
                "pantalla=" + pantalla +
                ", " + super.toString() +
                '}';
    }
}
