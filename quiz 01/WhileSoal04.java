public class WhileSoal04 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 10;
        int hasil = 0;

        while(awal <= akhir){
            if(awal % 2 == 0) {
                hasil = hasil + awal;
            }
            awal++;
        }

        tulis(hasil);
    }

    public static void tulis(Object x){
        System.out.println(x);
    }
}