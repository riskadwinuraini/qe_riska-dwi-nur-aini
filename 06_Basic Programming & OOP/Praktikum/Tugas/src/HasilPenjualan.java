import java.util.Scanner;
public class HasilPenjualan {
    public static void main(String[] args) {
            int hargaBeli = 12000;
            int hargaJual = 9000;
            int keuntungan = hargaJual - hargaBeli;

            switch (Integer.signum(keuntungan)) {
                case 1:
                    System.out.println("Untung sebesar: " + keuntungan);
                    break;
                case -1:
                    System.out.println("Rugi sebesar: " + keuntungan);
                    break;
                default:
                    System.out.println("Sama saja");
                    break;
            }
        }
    }

