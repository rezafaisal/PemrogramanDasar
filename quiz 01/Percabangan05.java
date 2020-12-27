public class Percabangan05 {
    public static void main(String[] args) {
        int nilai = 61;
        tulisNilai(nilai);
    }
    
    public static void tulisNilai(int x) {
        if(x < 80) {
            tulis("A");
        } else if (x < 70) {
            tulis("B");
        } else if (x < 60) {
            tulis("C");
        } else if (x < 50) {
            tulis("D");
        } else {
            tulis("tidak lulus");
        }
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}