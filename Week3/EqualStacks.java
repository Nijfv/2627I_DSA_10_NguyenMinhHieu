import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int i = 0, j = 0, k = 0;

        int l1 = 0;
        for (int val : h1) l1 += val;

        int l2 = 0;
        for (int val : h2) l2 += val;

        int l3 = 0;
        for (int val : h3) l3 += val;

        while (l1 != l2 || l2 != l3) {
            int minHeight = Math.min(l1, Math.min(l2, l3));

            while (l1 > minHeight && i < h1.size()) {
                l1 -= h1.get(i);
                i++;
            }

            while (l2 > minHeight && j < h2.size()) {
                l2 -= h2.get(j);
                j++;
            }

            while (l3 > minHeight && k < h3.size()) {
                l3 -= h3.get(k);
                k++;
            }

            if (l1 == 0 || l2 == 0 || l3 == 0) {
                return 0;
            }
        }

        return l1;
    }
}