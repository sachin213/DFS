import java.util.HashMap;
import java.util.Map;

public class DuplicatePresent {
    public static void main(String[] args) {
        System.out.println(ifDuplicatePresent(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    static boolean ifDuplicatePresent(int[] nums){
        Map<Integer,Integer> map = new HashMap();
        for( int n : nums){
            if(map.containsKey(n)){ return true; }
            else{
                map.put(n,n);
            }
        }
        return false;
    }
}
