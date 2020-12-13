public class Prosedur04 {
    public static void main(String[] args) {
        tulisUlang(1, 5);
        garis();
        tulisUlang(5, 10);
        garis();
        tulisUlang(10, 15);
    }

    public static void tulis(Object o){
        System.out.println(o);
    }

    public static void garis(){
        System.out.println("----------------------------");
    }

    public static void tulisUlang(int awal, int akhir){
        tulis("mulai.");
        for(int i = awal; i <= akhir; i++) {
            tulis(i);
        }
        tulis("selesai.");
    }
}