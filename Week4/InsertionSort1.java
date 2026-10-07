import java.util.List;

public class InsertionSort1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        int target = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && arr.get(i) > target) {
            arr.set(i + 1, arr.get(i));
            i--;
            for (int j = 0; j < n; j++) {
                System.out.print(arr.get(j) + (j == n - 1 ? "\n" : " "));
            }
        }
        arr.set(i + 1, target);
        for (int j = 0; j < n; j++) {
            System.out.print(arr.get(j) + (j == n - 1 ? "" : " "));
        }
    }
}