import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Autovehicul
        Autovehicul auto1 = new Autovehicul("Toyota", Color.BLUE, 180);

        // Afisarea informatiilor despre autovehiculul creat
        System.out.println("Marca autovehiculului: " + auto1.getMarca());
        System.out.println("Culoare autovehiculului: " + auto1.getCuloare());
        System.out.println("Viteza curenta a autovehiculului: " + auto1.getVitezaCurenta() + " km/h");
        System.out.println("Treapta de viteza curenta a autovehiculului: " + auto1.getTreaptaVitezaCurenta());
        System.out.println("Viteza maxima a autovehiculului: " + auto1.getVitezaMaxima() + " km/h");

        // Simulare accelerare
        auto1.accelerare(50); // Accelerare cu 50 km/h
        System.out.println("Viteza dupa accelerare: " + auto1.getVitezaCurenta() + " km/h");

        // Simulare schimbare treapta de viteza
        auto1.schimbaTreapta(2); // Schimbare la treapta 2
        System.out.println("Treapta de viteza dupa schimbare: " + auto1.getTreaptaVitezaCurenta());

        // Simulare oprire
        auto1.oprire(); // Oprire
        System.out.println("Viteza dupa oprire: " + auto1.getVitezaCurenta() + " km/h");
    }
}
