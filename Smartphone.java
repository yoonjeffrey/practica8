public class Smartphone extends Computadora {
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;

    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, Microprocesador cpu, long ramMB, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, cpu, ramMB);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sensorDeHuella=" + sensorDeHuella +
                ", pantalla=" + pantalla +
                ", " + super.toString() +
                '}';
    }
}
