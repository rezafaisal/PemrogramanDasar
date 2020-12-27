public class Percabangan10 {
    public static void main(String[] args) {
        int awal = 5;
        int akhir = 5;

        if(awal < akhir) {
            for(int i = awal; i<=akhir; i++){
                tulis(i);
            }
        } 
        if(awal > akhir) {
            for(int i = awal; i>=akhir; i--){
                tulis(i);
            }
        }

    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}