import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1= {1,4,8,9};
        int[] arr2 = {2,3,5,7};
        List<Integer> integerList = new ArrayList<>();
        int i = 0;
        int j = 0;

        //compare arr1 and arr2 element and increment belonging index of array which has smaller value till end of one of the input array
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] > arr2[j]){
                integerList.add(arr2[j]);
                j++;
            } else {
                integerList.add(arr1[i]);
                i++;
            }
        }

        //if (i >= arr1.length){
        //if arra1 has finished , get all arra2 element and push it straight forward
          while(i >= arr1.length && j < arr2.length){
              integerList.add(arr2[j]);
              j++;
          }
       // }

        //if (j >= arr2.length){
        //if arra2 has finished , get all arra1 element and push it straight forward
            while(j >= arr2.length && i < arr1.length){
                integerList.add(arr1[i]);
                i++;
            }
        //}


        integerList.stream().forEach(x -> System.out.print(x+ " ") );
    }
}
