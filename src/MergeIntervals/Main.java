package MergeIntervals;

import java.util.*;
import static java.lang.Math.max;

public class Main {

    // Given a two-dimensional array.
    // Your task to merge overlapping intervals
    // And return a new two-dimensional array.

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        List <int[]> output_arr = new ArrayList<>();

        int[] current_interval = intervals[0];
        output_arr.add(current_interval);

        for (int[] interval : intervals) {
            int current_end = current_interval[1];

            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin) {
                current_interval[1] = max(current_end, next_end);
            } else {
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }

        return output_arr.toArray(new int[output_arr.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 16}, {15, 18}};

        int[][] merge_intervals = merge(intervals);

        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval));
        }

        System.out.println();

        for (int[] interval : merge_intervals) {
            System.out.print(Arrays.toString(interval));
        }
    }

}
