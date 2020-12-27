public class WhileSoal02 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 10;
        int hasil = 0;

        while(awal <= akhir){
            if(awal % 2 == 0) {
                tulis(awal);
            }
            awal++;
        }
    }

    public static void tulis(Object x){
        System.out.println(x);
    }
}