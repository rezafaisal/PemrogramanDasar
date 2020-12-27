public class Percabangan06 {
    public static void main(String[] args) {
        int berat = 80;
        int tinggi = 150;
        int umur = 42;
        
        if(umur > 40) {
            if(berat > 70) {
                if (tinggi < 165) {
                    tulis("jalan lari cepat");
                }
            }
        } else {
            if(berat > 70 && tinggi < 165) {
                tulis("kurangi berat sebelum lari");
            } else {
                tulis("selamat berlari");
            }
        }
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}