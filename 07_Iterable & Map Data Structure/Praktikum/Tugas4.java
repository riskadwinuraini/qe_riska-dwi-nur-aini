import java.util.*;

public class Tugas4 {
    public static int[] getUniqueArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr2) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,8};
        int[] arr2 = {2,8};
        int[] result = getUniqueArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}