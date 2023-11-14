import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

        while(true){
            String lestTekst=showInputDialog("Skriv inn en tekst som det skal gjøre analyse av(tom input for stopp): ");
            if(lestTekst.isEmpty()){
                System.out.println("Avslutter...");
                break;
            }
            Tekstanalyse analyse=new Tekstanalyse(lestTekst);
            System.out.println("Antall forskjellige bokstaver:");
            System.out.println(analyse.tellForskjelligeBokstaver());
            System.out.println("Antall bokstaver ");
            System.out.println(analyse.finnAntallBokstaver());
            System.out.println("Prosent ikke bokstaver:");
            System.out.println(analyse.prosentIkkeBokstaver());
            String lestBokstav=showInputDialog("Skriv inn en bokstav så ser vi hvor mange ganger den forekommer:");
            System.out.println("Antall ganger '"+lestBokstav+"' forekommer");
            System.out.println(analyse.forekomstAvBokstav(lestBokstav));
            System.out.println(analyse.mestForekommendeBokstav());
        }

    }
}