public class Prosedur01 {
    public static void main(String[] args) {
        tulisBudi();
        enter();
        tulisWati();
        enter();
        tulisAdi();
    }

    public static void tulis(String str){
        System.out.println(str);
    }

    public static void enter(){
        System.out.println();
    }

    public static void tulisBudi(){
        tulis("==========================");
        tulis("|| Nama: Budi           ||");
        tulis("|| PS: Ilmu Komputer    ||");
        tulis("==========================");
    }

    public static void tulisWati(){
        tulis("==========================");
        tulis("|| Nama: Wati           ||");
        tulis("|| PS: Farmasi          ||");
        tulis("==========================");
    }

    public static void tulisAdi(){
        tulis("==========================");
        tulis("|| Nama: Adi            ||");
        tulis("|| PS: Statistika       ||");
        tulis("==========================");
    }
}