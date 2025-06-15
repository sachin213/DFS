package interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CanAttendAllMeeting {
    //sort
    //a[1] <= b[0]
    public static void main(String[] args) {
        //int[][]  intervals = {{5,10} , {0,30}};
        //int[][]  intervals = {{0,30} ,{20,31}};
        //int[][]  intervals = {{10,30} ,{15,25}};
//        int[][]  intervals = {{10,30} ,{30,31}};
//
//        Arrays.sort(intervals, Comparator.comparingInt(array -> array[0]));
//        System.out.println(Arrays.deepToString(intervals));
//        boolean canAttendAllMeeting  = true;
//        for(int i =0 ; i< intervals.length-1 ;i++){
//             if(intervals[i][1] > intervals[i+1][0]){
//                 canAttendAllMeeting = false;
//                 break;
//             }
//        }
//
//        if(canAttendAllMeeting) System.out.println("Person can attend all meeting");
//        else System.out.println("person can not able to attend all meetings");


        List<List<Integer>> intervalList = new ArrayList<>();
        List<Integer> meeting1 = Arrays.asList(5, 10);
        List<Integer> meeting2 = Arrays.asList(0, 30);
        List<Integer> meeting3 = Arrays.asList(4, 11);
        intervalList.add(meeting1);
        intervalList.add(meeting2);
        intervalList.add(meeting3);


        intervalList.stream().sorted(Comparator.comparing(List::getFirst));
        intervalList.stream().forEach(System.out::println);
        boolean canAttendAllMeeting1  = true;
        for(int i =0 ; i< intervalList.size()-1 ;i++){
            if(intervalList.get(i).get(1) > intervalList.get(i+1).get(0)){
                canAttendAllMeeting1 = false;
                break;
            }
        }
        if(canAttendAllMeeting1) System.out.println("list Person can attend all meeting");
        else System.out.println("list person can not able to attend all meetings");
        //return canAttendAllMeeting1;
    }
}
