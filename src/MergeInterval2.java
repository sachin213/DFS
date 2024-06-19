import java.util.ArrayList;
import java.util.List;

public class MergeInterval2 { //in-correct
    public static void main(String[] args) {
        //sort it
        int[][] intervals = {{1,3},{2,6},{4,7},{8,10},{9,18}};
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if ( i < intervals.length-1 && intervals[i][1] > intervals[i + 1][0]) {
                int[] newInterval = {intervals[i][0], intervals[i + 1][1]};
                list.add(newInterval);
                i ++;
            }
           else{
                list.add(intervals[i]);
            }
        }
        for (int[] interval :list){
            System.out.println("");
            for(int num : interval){
                System.out.print(num+" ,");
            }
        }

    }
 }
