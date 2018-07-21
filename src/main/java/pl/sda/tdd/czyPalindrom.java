package pl.sda.tdd;

public class czyPalindrom {

    public static void main(String[] args) {
        String wort = "rekier";
        char[] warray = wort.toCharArray();
        System.out.println(istPalindrom(warray));
    }
    public static boolean istPalindrom(char[] wort){
        int i1 = 0;
        int i2 = wort.length - 1;
        while (i2 > i1) {
            if (wort[i1] != wort[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

   /* public static boolean istPalindrom(char[] wort){
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }
        return true;
    }*/
}
