import java.util.Random;
public class Matrise {
    private int[][] matrise;
    private int m;
    private int n;
    private Random random=new Random();

    public Matrise(int m,int n){
        this.m=m;//m og n er størrelse på matrisen
        this.n=n;
        matrise=new int[m][n];

        //fyller matrise
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrise[i][j]=random.nextInt(-15,20);
            }
        }

    }


    public int[][] summerMatriser(Matrise annenMatrise){
        if(this.m==annenMatrise.m && this.n==annenMatrise.n) {
            int[][] resultat = new int[m][n];
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[i].length; j++) {
                    resultat[i][j] = matrise[i][j] + annenMatrise.matrise[i][j];
                }
            }
            return resultat;
        }
        else{
            return null;
        }
    }

    public int[][] multipliserMatriser(Matrise annenMatrise){//this*annenMatrise
        if (this.n==annenMatrise.m){
            int[][] resultat=new int[this.m][annenMatrise.n];
            for (int i=0;i<this.matrise.length;i++){
                for(int j=0;j<annenMatrise.matrise[0].length;j++){
                    int verdiIResultat=0;
                    for(int k=0;k<this.matrise[i].length;k++){
                        verdiIResultat+=this.matrise[i][k]*annenMatrise.matrise[k][j];
                    }resultat[i][j]=verdiIResultat;
                }
            }
            return resultat;
        }
        else{
            return null;
        }
    }

    public String toString(){
        String matrisa="";
        for(int i=0;i<this.matrise.length;i++){
            String rad="";
            for(int j=0;j<this.matrise[i].length;j++){
                rad+=this.matrise[i][j]+" ";
            }matrisa+=rad+"\n";
        }
        return matrisa;
    }

    public int[][] transponerMatrise(){
        int[][] resultat=new int[this.n][this.m];
        for(int i=0;i<this.matrise[0].length;i++){
            for(int j=0;j<this.matrise.length;j++){
                resultat[i][j]=this.matrise[j][i];
            }
        }
        return resultat;
    }
}
