import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> freq = new ArrayList<>(Collections.nCopies(100, 0));
        for (int num : arr) {
            freq.set(num, freq.get(num) + 1);
        }
        return freq;
    }
}