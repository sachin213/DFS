import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
       int [] [] input = sortInput(new int [][] {{1, 3}, {2,6},{8,10},{8,9},{9,11},{15,18},{2,4},{16,17}});
        List<int[]> interval = getInterval(input);
        System.out.println(Arrays.deepToString(interval.toArray()));
    }

    private static List<int[]> getInterval(int[][] input) {

        int[] newInterval = input[0];
        List<int[]>  result = new ArrayList<>();
        result.add(newInterval);
        for(int[] interval : input)
        {
            if(newInterval[1] >= interval[0]){
                newInterval[1] = interval[1];
            }
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result;
    }

    private static int[][] sortInput(int[][] input) {
        Arrays.sort(input, Comparator.comparing(x -> ((int[])x)[0]).thenComparing(x -> ((int[])x)[1]));
        System.out.println(Arrays.deepToString(input));
        return  input;
    }
}
