public class UchBurchtuk {
    int a;
    int b;
    int c;
    public double mettod ( ){
        int  summa = 0;
        summa = (a + b+ c) /2;
        int summa1 = summa -a ;
        int summa2 = summa - b;
        int summa3 = summa - c;
        double ayant= (int) Math.sqrt(summa * summa1 * summa2 * summa3);
        return ayant;
    }
}
