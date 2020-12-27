public class Percabangan02 {
    public static void main(String[] args) {
        String nama = "adi";

        if(nama == "wati") {
            wati();
        } else if (nama == "budi") {
            budi();
        }
    }
    
    public static void budi() {
        System.out.println("budi");
    }

    public static void wati() {
        System.out.println("wati");
    }

    public static void adi() {
        System.out.println("adi");
    }
}