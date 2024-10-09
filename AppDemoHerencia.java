import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Lista de Smartphones
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();

        Microprocesador cpu1 = new Microprocesador("Intel", "12345", "Intel", "i7", 8, 3200000000L);
        Sensor sensor1 = new Sensor("Qualcomm", "54321", "Qualcomm", "Sensor1", "Huella Dactilar", "dpi", 500);
        Pantalla pantalla1 = new Pantalla("Samsung", "11111", "Samsung", "Pantalla1", 1080, 1920);
        Smartphone smartphone1 = new Smartphone("Apple", "A123", "Apple", "iPhone", cpu1, 4096, sensor1, pantalla1);

        Microprocesador cpu2 = new Microprocesador("Qualcomm", "67890", "Qualcomm", "Snapdragon", 6, 2800000000L);
        Sensor sensor2 = new Sensor("Sony", "98765", "Sony", "Sensor2", "Huella Dactilar", "dpi", 450);
        Pantalla pantalla2 = new Pantalla("LG", "22222", "LG", "Pantalla2", 720, 1280);
        Smartphone smartphone2 = new Smartphone("Samsung", "S456", "Samsung", "Galaxy", cpu2, 6144, sensor2, pantalla2);

        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        // Lista de Televisiones
        ArrayList<Television> listaDeTVs = new ArrayList<>();

        Pantalla pantallaTV1 = new Pantalla("LG", "33333", "LG", "PantallaTV1", 3840, 2160);
        Television tv1 = new Television("LG", "TV123", "LG", "OLED TV", pantallaTV1);

        Pantalla pantallaTV2 = new Pantalla("Sony", "44444", "Sony", "PantallaTV2", 1920, 1080);
        Television tv2 = new Television("Sony", "TV456", "Sony", "LED TV", pantallaTV2);

        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);

        // Mostrar Smartphones
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
            System.out.println();
        }

        // Mostrar Televisiones
        System.out.println("Lista de Televisiones:");
        for (Television tv : listaDeTVs) {
            System.out.println(tv);
            System.out.println();
        }
    }
}
