import javax.swing.plaf.basic.BasicLookAndFeel;
import java.sql.Array;
import java.util.ArrayList;
public class Tekstanalyse {
    private int[] antallTegn=new int[30];
    final private String tekst;

    final private String ALFABETlower="abcdefghijklmnopqrstuvwxyzæøå";
    final private String ALFABETupper=ALFABETlower.toUpperCase();
    public Tekstanalyse(String tekst){
        this.tekst=tekst;

        for(int i=0;i<this.tekst.length();i++){//løkke som går gjennom hver og en bokstav i tekst
            char c=this.tekst.charAt(i);//hver bokstav lagres i variabelen c
            if(ALFABETupper.contains(String.valueOf(c))){//sjekker om bokstaven finnes i uppercase alfabet
                int indexIAlfabet=ALFABETupper.indexOf(String.valueOf(c));//finner indexen i alfabetet
                antallTegn[indexIAlfabet]+=1;//legger til en på den indexen
            }
            else if(ALFABETlower.contains(String.valueOf(c))){//sjekker om bokstaven finnes i lowercase alfabet
                int indexIAlfabet=ALFABETlower.indexOf(String.valueOf(c));//finner indexen i alfabetet
                antallTegn[indexIAlfabet]+=1;//legger til indexen
            }
            else{//hvis tegnet ikke finnes i lower eller uppercase alfabetet
                antallTegn[29]+=1;//legger til 1 på den siste verdien
            }
        }
    }
    public int tellForskjelligeBokstaver(){
        int antall=0;
        for(int i=0;i<antallTegn.length-1;i++){
            if(antallTegn[i]!=0){
                antall++;
            }
        }
        return antall;
    }

    public int finnAntallBokstaver(){
        int sum=0;

        for(int i=0;i<antallTegn.length-1;i++){
            sum+=antallTegn[i];
        }
        return sum;
    }

    public double prosentIkkeBokstaver(){
        double antallIkkeBokstav=antallTegn[29];
        double antallBokstav=finnAntallBokstaver();

        return (antallIkkeBokstav/antallBokstav)*100;
    }

    public int forekomstAvBokstav(String s){
        s=s.toLowerCase();
        int indexBokstav=ALFABETlower.indexOf(s);
        return antallTegn[indexBokstav];
    }

    public String mestForekommendeBokstav(){
        int hoyestAntall=0;
        ArrayList<Character> oftestBokstaver=new ArrayList<Character>();

        for(int i=1;i<antallTegn.length-1;i++){
            if (antallTegn[i]>hoyestAntall){
                hoyestAntall=antallTegn[i];
            }
        }
        for(int i=0;i<antallTegn.length-1;i++){
            if (antallTegn[i]==hoyestAntall){
                oftestBokstaver.add(ALFABETlower.charAt(i));
            }
        }

        String resultat="De(n) mest forekommende bokstaver(en) i teksten er:";
        for(Character a:oftestBokstaver){
            resultat+=a+" ";
        }
        return resultat;
    }

}
