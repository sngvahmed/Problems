package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaxSubArray {
    private int bruteForce(ArrayList<Integer> A) {
        int tot = 0;
        for (int i = 0 ; i < A.size(); i++) {
            for (int j = i ; j < A.size(); j++) {
                int t1 = Math.abs((i + 1) - (j + 1)) + Math.abs(A.get(i) - A.get(j));
                int t2 = Math.abs((j + 1) - (i + 1)) + Math.abs(A.get(j) - A.get(i));
                tot = Math.max(Math.max(t2, t1), tot);
            }
        }
        return tot;
    }

    public int maxArr(ArrayList<Integer> A) {
        int amx = IntStream.range(0, A.size()).map(i -> A.get(i) + i).max().getAsInt();
        int amn = IntStream.range(0, A.size()).map(i -> A.get(i) + i).min().getAsInt();

        int mmx = IntStream.range(0, A.size()).map(i -> A.get(i) - i).max().getAsInt();
        int mmn = IntStream.range(0, A.size()).map(i -> A.get(i) - i).min().getAsInt();

        return ((amx-amn)>(mmx-mmn)) ? amx-amn : mmx-mmn;
    }

}
