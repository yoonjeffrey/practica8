public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", encendido=" + encendido +
                '}';
    }
}
