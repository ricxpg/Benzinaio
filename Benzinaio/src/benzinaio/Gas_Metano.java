package benzinaio;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Gas_Metano {

    private int max_litri;
    private double litri;
    private double prezzo;
    public static Scanner sc = new Scanner(System.in);

    public Gas_Metano(int max_litri, double litri, double prezzo) {
        this.max_litri = max_litri;
        this.litri = litri;
        this.prezzo = prezzo;
    }

    public void ConfiguraPrezzo() {
        System.out.println("inserisci il prezzo al chilo per il "
                + "metano:");
        setPrezzo(sc.nextDouble());
    }

    public void FaiMetano() {
        System.out.println("inserire denaro(€): "
                + "(prezzo metano attuale: "
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
