public class Prosedur02 {
    public static void main(String[] args) {
        tulisKartu("Budi", "Ilmu Komputer");
        enter();
        tulisKartu("Wati", "Farmasi");
        enter();
        tulisKartu("Adi", "Statistika");
    }

    public static void tulis(String str){
        System.out.println(str);
    }

    public static void enter(){
        System.out.println();
    }

    public static void tulisKartu(String nama, String ps){
        tulis("==========================");
        tulis("|| Nama: " + nama + "           ||");
        tulis("|| PS: " + ps + "    ||");
        tulis("==========================");
    }
}