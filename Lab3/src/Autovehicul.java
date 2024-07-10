import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private double vitezaCurenta; // km/h
    private int treaptaVitezaCurenta;
    private double vitezaMaxima; // km/h

    // Constructor fără parametri
    public Autovehicul() {
        this.marca = "Necunoscuta";
        this.culoare = Color.BLACK;
        this.vitezaCurenta = 0;
        this.treaptaVitezaCurenta = 0;
        this.vitezaMaxima = 200; // km/h (valoare implicită)
    }

    // Constructor cu parametri
    public Autovehicul(String marca, Color culoare, double vitezaMaxima) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaCurenta = 0;
        this.treaptaVitezaCurenta = 0;
        this.vitezaMaxima = vitezaMaxima;
    }

    // Metode accesoare (get) si mutatoare (set)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public double getVitezaCurenta() {
        return vitezaCurenta;
    }

    public int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }

    public double getVitezaMaxima() {
        return vitezaMaxima;
    }

    // Metoda de accelerare
    public void accelerare(double kmPerHour) {
        if (vitezaCurenta + kmPerHour <= vitezaMaxima) {
            vitezaCurenta += kmPerHour;
        } else {
            vitezaCurenta = vitezaMaxima;
        }
    }

    // Metoda de decelerare
    public void decelerare(double kmPerHour) {
        if (vitezaCurenta - kmPerHour >= 0) {
            vitezaCurenta -= kmPerHour;
        } else {
            vitezaCurenta = 0;
        }
    }

    // Metoda de schimbare a treptei de viteză
    public void schimbaTreapta(int treapta) {
        if (treapta >= 0 && treapta <= 5) {
            treaptaVitezaCurenta = treapta;
        } else {
            System.out.println("Treapta de viteza invalida!");
        }
    }

    // Metoda de oprire
    public void oprire() {
        vitezaCurenta = 0;
        treaptaVitezaCurenta = 0;
    }

    // Metoda de simulare a deplasarii pe o distanta data
    public void deplasare(double distanta) {
        double timpNecesar = distanta / vitezaCurenta;
        System.out.println("Deplasare pe o distanta de " + distanta + " km dureaza " + timpNecesar + " ore.");
    }

    public static void main(String[] args) {
        Autovehicul masina = new Autovehicul("Audi", Color.RED, 250); // Creare obiect Autovehicul

        // Simulare deplasare
        masina.accelerare(100); // Accelerare cu 100 km/h
        masina.deplasare(500); // Deplasare pe o distanta de 500 km
        masina.decelerare(50); // Decelerare cu 50 km/h
        masina.deplasare(200); // Deplasare pe o distanta de 200 km
        masina.oprire(); // Oprire
    }
}
