using System;
using System.Collections.Generic;
using System.Linq;

class EqualStacks
{
    public static int equalStacks(List<int> h1, List<int> h2, List<int> h3)
    {
        int i = 0, j = 0, k = 0;

        int l1 = h1.Sum();
        int l2 = h2.Sum();
        int l3 = h3.Sum();

        while (l1 != l2 || l2 != l3)
        {
            int minHeight = Math.Min(l1, Math.Min(l2, l3));

            while (l1 > minHeight && i < h1.Count)
            {
                l1 -= h1[i];
                i++;
            }

            while (l2 > minHeight && j < h2.Count)
            {
                l2 -= h2[j];
                j++;
            }

            while (l3 > minHeight && k < h3.Count)
            {
                l3 -= h3[k];
                k++;
            }

            if (l1 == 0 || l2 == 0 || l3 == 0)
            {
                return 0;
            }
        }

        return l1;
    }
}