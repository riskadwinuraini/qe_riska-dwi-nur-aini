import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        // Input array
        String[] arr1 = {"riska", "dwi", "nuraini"};
        String[] arr2 = {"altera", "riska"};

        // Menggabungkan dua buah array dan menyaring elemen
        String[] mergedArray = mergeArrays(arr1, arr2);

        // Output hasil
        System.out.println(Arrays.toString(mergedArray));
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        // Menggabungkan dua buah array menggunakan ArrayList
        ArrayList<String> mergedList = new ArrayList<>(Arrays.asList(arr1));
        mergedList.addAll(Arrays.asList(arr2));

        // Menghapus elemen yang sama menggunakan HashSet
        HashSet<String> uniqueSet = new HashSet<>(mergedList);

        // Mengembalikan hasil penggabungan dan penyaringan
        return uniqueSet.toArray(new String[0]);
    }
}