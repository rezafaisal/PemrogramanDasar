public class Percabangan01 {
    public static void main(String[] args) {
        String nama = "adi";

        if(nama == "wati") {
            wati();
        } else {
            budi();
        }
    }
    
    public static void budi() {
        System.out.println("budi");
    }

    public static void wati() {
        System.out.println("wati");
    }
}