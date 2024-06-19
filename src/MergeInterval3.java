import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeInterval3 {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort the intervals based on the start time
        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> result = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);

            if (interval.start <= currentInterval.end) {
                // Overlapping intervals, merge them
                currentInterval.end = Math.max(currentInterval.end, interval.end);
            } else {
                // Non-overlapping interval, add the current interval to the result
                result.add(currentInterval);
                currentInterval = interval;
            }
        }

        // Add the last interval
        result.add(currentInterval);

        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(4, 7),
                new Interval(8, 10),
                new Interval(15, 18)
        );

        List<Interval> mergedIntervals = merge(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}