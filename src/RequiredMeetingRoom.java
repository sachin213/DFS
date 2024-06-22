import java.util.Arrays;
import java.util.Comparator;

public class RequiredMeetingRoom {
    public static void main(String[] args) {
       // int[][] meetings = {{1,3},{3,6},{4,6},{5,9}}; //required meeting room 3
        int[][] meetings = {{0,30},{5,10},{15,20}}; //required meeting room 3
        //array should not be null and size should be  > 0
        int minimumRequiredMeetingRoom  = 1;

        //sort it
        Arrays.sort(meetings,Comparator.comparingInt(a -> a[0]));

        int i = 0;
        while (i < meetings.length - 1){
            if(meetings[i][1] > meetings[i+1][0]){
                minimumRequiredMeetingRoom ++;
            }
            i++;
        }
        System.out.println("Required meeting rooms:"+minimumRequiredMeetingRoom);
    }

}
