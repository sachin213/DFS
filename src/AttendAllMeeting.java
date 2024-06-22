import java.util.Arrays;
import java.util.Comparator;

public class AttendAllMeeting {
    public static void main(String[] args) {
        //int[][] meetings = {{1, 3}, {2, 4}, {5, 6}};
        int[][] meetings = {{1, 3}, {3, 7}, {5, 9}};
        //sort if first
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int i = 0;
        boolean isAbleToAttendAllMeeting = true;
        while (i < meetings.length-1){
            if(meetings[i][1] > meetings[i+1][0]){
                isAbleToAttendAllMeeting = false;
                break;
            }
            i++;
        }
        System.out.println("isAbleToAttendAllMeeting :"+ isAbleToAttendAllMeeting);
    }
}
