public class ComponenteElectronico extends DispositivoElectronico {
    private DispositivoElectronico esParteDe;

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
    }

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "null") +
                '}';
    }
}
