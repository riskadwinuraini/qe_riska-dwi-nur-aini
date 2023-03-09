import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextInt();

        System.out.print("Pilih operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        if (operator == '+') {
            hasil = tambah(angka1, angka2);
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        } else if (operator == '-') {
            hasil = kurang(angka1, angka2);
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        } else if (operator == '*') {
            hasil = kali(angka1, angka2);
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
        } else if (operator == '/') {
            hasil = bagi(angka1, angka2);
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        } else {
            System.out.println("Operator yang dimasukkan tidak valid");
        }

        input.close();
    }

    public static int tambah(int a, int b) {
        System.out.print("penjumlahan : " );
        return a + b;
    }

    public static int kurang(int a, int b) {
        System.out.print("pengurangan");
        return a - b;
    }

    public static int kali(int a, int b) {
        System.out.println("perkalian");
        return a * b;
    }

    public static int bagi(int a, int b) {
        System.out.println("pembagian");
        return a / b;
    }
}
