public class Pantalla extends ComponenteElectronico {
    private final int resolucionX;
    private final int resolucionY;

    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, int resolucionX, int resolucionY) {
        super(fabricante, numeroSerie, marca, nombre);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                ", " + super.toString() +
                '}';
    }
}
