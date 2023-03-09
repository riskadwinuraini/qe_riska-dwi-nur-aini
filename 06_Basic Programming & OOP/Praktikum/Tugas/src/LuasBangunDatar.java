public class LuasBangunDatar {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // hitung luas segitiga
        int luasSegitiga = (int) (0.5 * alas *tinggi);

        // tampilkan hasil
        System.out.println("Luas segitiga: " + luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //hitung luas persegi panjang
        int luasPersegiPanjang = (int) (panjang*lebar);

        // tampilkan hasil
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        // lingkaran
        double phi = 3.14;
        int jari2= 7;

        //luas lingkaran
        double luas = phi * jari2 * jari2;

        // tampilkan hasil
        System.out.println("Luas Lingkaran : " + luas);
    }
}
