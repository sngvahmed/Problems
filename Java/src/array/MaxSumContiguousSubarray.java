package my.sngv.interviewbit.programming.array;

import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubarray {
    int maxSubArray(final List<Integer> A) {
        int [] arr = new int [A.size()];
        int [] o = A.stream().mapToInt(v -> v).toArray();
        if (o.length == 0) return 0;

        arr[0] = o[0];
        for(int i = 1 ; i < o.length; i++) {
            arr[i] = Math.max(arr[i - 1], 0)  + o[i];
        }

        return Arrays.stream(arr).max().getAsInt();
    }
}
