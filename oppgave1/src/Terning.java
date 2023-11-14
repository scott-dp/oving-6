public class Terning {
    private java.util.Random random=new java.util.Random();
    public int[] fyllTabell(){
        int[] antall=new int[10];

        for(int i=0;i<1000;i++){
            int tall=random.nextInt(10);
            antall[tall]+=1;
        }

        return antall;
    }
}
