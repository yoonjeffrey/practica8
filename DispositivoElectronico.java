import java.util.ArrayList;

public class DispositivoElectronico {
    private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes;

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }

    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
    }

    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", componentes=" + componentes +
                '}';
    }
}
