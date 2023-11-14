// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Matrise minMatrise=new Matrise(3,2);
        System.out.println(minMatrise);

        Matrise nyMatrise=new Matrise(2,3);
        System.out.println(nyMatrise);

        //int[][] resultatMatrise=minMatrise.multipliserMatriser(nyMatrise);
        int[][] resultatMatrise=minMatrise.transponerMatrise();


        String matrisa="";
        for(int i=0;i<resultatMatrise.length;i++){
            String rad="";
            for(int j=0;j<resultatMatrise[i].length;j++){
                rad+=resultatMatrise[i][j]+" ";
            }matrisa+=rad+"\n";
        }
        System.out.println(matrisa);

    }
}