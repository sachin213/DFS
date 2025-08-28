package interval;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class NumberOfDaysToAttend {
    int i = 1;
    public int minMeetingRooms(List<Interval> intervals) {
           List<Integer> startList = intervals.stream().map(interval -> interval.start).sorted().toList();
           List<Integer> endList = intervals.stream().map(interval -> interval.end).sorted().toList();
           int numberOfDays = 0;
           int startPointer = 0;
           int endPointer = 0;
           int result = 0;
           while(startPointer < intervals.size())
           {
              if(startList.get(startPointer) < endList.get(endPointer)){
                  startPointer++;
                  numberOfDays++;
              } else{
                  endPointer++;
                  numberOfDays--;
              }
              result = Math.max(result,numberOfDays);
           }
            return result;
    }

    public static void main(String[] args) {
        // [(1,9),(2,6),(3,7),(4,8),(5,9)]
        //[1,2,3,4,5]
        //[6,7,8,9,9]
        //1<5 1
        //2<5 2
        //3<5 3
        //4<5 4
        //5 !<5 4

        //[1,2,6,7,8]
        //[2,6,7,8,10]
        //1,2 : 1 : 1
        //2,2 : 6 : 0 : 1
        //2,6 : 6 : 1 : 1
        //6,6 : 7 : 0 : 1
        //7,6 : 6 : 1 : 1
        //7,7 : 8 : 0 : 1
        //8,7 : 7 : 1 : 1
        //8,8 : 10 : 0 : 1

        List<Interval> intervalList = new ArrayList<>(List.of(
                //new Interval(10,12),new Interval(2,4),new Interval(1,3),new Interval(3,5))
                 new Interval(1,5),new Interval(2,6),new Interval(3,7),new Interval(4,8),new Interval(5,9)));
        NumberOfDaysToAttend numberOfDaysToAttend = new NumberOfDaysToAttend();
        System.out.println(numberOfDaysToAttend.minMeetingRooms(intervalList));
    }
}

