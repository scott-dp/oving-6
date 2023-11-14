// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Terning terning=new Terning();

        int[] table =terning.fyllTabell();

        for(int antall: table){
            System.out.println(antall);
        }
    }
}