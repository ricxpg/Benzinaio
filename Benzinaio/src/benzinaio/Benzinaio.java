package benzinaio;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Benzinaio {

    public static void main(String[] args) {
        Benzina b = new Benzina(0, 1.70, 1000);
        Diesel d = new Diesel(1500, 0, 1.58);
        Gas_Metano gs = new Gas_Metano(2000, 0, 1.76);
        boolean ciclo = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("seleziona un opzione:"
                    + "\n1. Cliente"
                    + "\n2. Gestore");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("seleziona un opzione:"
                            + "\n1. Rifornimento"
                            + "\n2. Esci");
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("seleziona la pompa da"
                                    + " rifornimento:"
                                    + "\n1. Benzina (pompa 4)"
                                    + "\n2. Diesel (pompa 4)"
                                    + "\n3. Gas Metano (pompa 2)");
                            switch (sc.nextInt()) {
                                case 1:
                                    b.FaiBenzina();
                                    System.out.println("hai fatto " + b.getLitri() + " di benzina!"
                                            + "\n1. Fanne ancora"
                                            + "\n2. Esci");
                                    switch (sc.nextInt()) {
                                        case 1:
                                            b.FaiBenzina();
                                            break;
                                        case 2:
                                            ciclo = true;
                                            break;
                                    }
                                    break;
                                case 2:
                                    d.FaiDiesel();
                                    System.out.println("hai fatto " + d.getLitri() + " di diesel!"
                                            + "\n1. Fanne ancora"
                                            + "\n2. Esci");
                                    switch (sc.nextInt()) {
                                        case 1:
                                            d.FaiDiesel();
                                            break;
                                        case 2:
                                            ciclo = true;
                                            break;
                                    }
                                    break;
                                case 3:
                                    gs.FaiMetano();
                                    System.out.println("hai fatto " + gs.getLitri() + " di metano!"
                                            + "\n1. Fanne ancora"
                                            + "\n2. Esci");
                                    switch (sc.nextInt()) {
                                        case 1:
                                            gs.FaiMetano();
                                            break;
                                        case 2:
                                            ciclo = true;
                                            break;

                                    }
                                    break;

                            }
                        case 2:
                            ciclo = true;
                            break;
                    }
                case 2:
                    System.out.println("benvenuto nella sezione gestione, "
                            + "scegli un opzione:"
                            + "\n1. Cambia il prezzo dei carburanti"
                            + "\n2. Visualizza le cisterne"
                            + "\n3. Rifornisci le cisterne"
                            + "\n4. Consuntivo giornaliero e mensile"
                            + "\n5. Totale erogato e denaro incassato");
                    switch (sc.nextInt()) {
                        case 1:
                            b.ConfiguraPrezzo();
                            d.ConfiguraPrezzo();
                            gs.ConfiguraPrezzo();
                            break;
                        case 2:
                            System.out.println("Benzina: " + b.getLitri() + " "
                                    + "rimasti");
                            System.out.println("Diesel: " + d.getLitri() + ""
                                    + " rimasti");
                            System.out.println("Gas Metano: " + gs.getLitri() +
                                     " rimasti");
                            break;
                            //ricorda di cambiare il valore dei litri per poter dire esattamente quelli rimasti
                    }

            }

        } while (ciclo = false);

    }
}
