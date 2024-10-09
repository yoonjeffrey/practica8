public class Sensor extends ComponenteElectronico {
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;

    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, String tipo, String unidadDeMedida, int valor) {
        super(fabricante, numeroSerie, marca, nombre);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                ", " + super.toString() +
                '}';
    }
}
