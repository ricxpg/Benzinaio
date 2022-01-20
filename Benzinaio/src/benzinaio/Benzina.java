package benzinaio;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Benzina {

    public static Scanner sc = new Scanner(System.in);
    private double litri;
    private double prezzo;
    private int max_litri;

    public Benzina(double litri, double prezzo, int max_litri) {
        this.litri = litri;
        this.max_litri = max_litri;
        this.prezzo = prezzo;
    }

    public void ConfiguraPrezzo() {
        System.out.println("inserisci il prezzo al litro per la "
                + "benzina:");
        setPrezzo(sc.nextDouble());
    }

    public void FaiBenzina() {
        System.out.println("inserire denaro(€): "
                + "(prezzo benzina attuale: "
                + getPrezzo() + ")");
        double den = sc.nextDouble();
        double ris;
        ris = getPrezzo() * den;

    }

    public double getLitri() {
        return litri;
    }

    public void setLitri(double litri) {
        this.litri = litri;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
