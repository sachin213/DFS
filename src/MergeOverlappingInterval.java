import java.util.*;

public class MergeOverlappingInterval {
    public static void main(String[] args) {
        //sort it
        int[][] intervals = {{1,3},{2,6},{4,7},{8,10},{9,18}};

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        Stack<int[]> resultStack = new Stack<>();
        int[] currentInterval = intervals[0];
        resultStack.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] intervalToCheck = intervals[i];
            if(currentInterval[1] > intervalToCheck[0]){
                currentInterval[1] = Math.max(currentInterval[1] , intervalToCheck[1]);
            }
            else{
                resultStack.add(intervalToCheck);
                currentInterval = intervalToCheck;
            }
        }

        for(int[] arr : resultStack){
            System.out.println("["+arr[0]+","+arr[1]+"]");
        }


    }
 }
