package interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        //sout merged intervals
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
        for (int i = 1; i < intervals.length; i++) {
            int[] lastMerged = merged.get(merged.size() - 1);
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= lastMerged[1]) {
                // Overlap: Merge by updating the end point
                lastMerged[1] = Math.max(lastMerged[1], currentEnd);
            } else {
                // No overlap: Add the new interval
                merged.add(intervals[i]);
            }
        }

        // Convert the list back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] mergedIntervals = solution.merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

}

