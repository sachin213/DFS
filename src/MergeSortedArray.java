import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1= {1,4,8,9};
        int[] arr2 = {2,3,5,7};
        List<Integer> integerList = new ArrayList<>();
        int i = 0;
        int j = 0;

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
          while(i >= arr1.length && j < arr2.length){
              integerList.add(arr2[j]);
              j++;
          }
       // }

        //if (j >= arr2.length){
            while(j >= arr2.length && i < arr1.length){
                integerList.add(arr1[i]);
                i++;
            }
        //}


        integerList.stream().forEach(x -> System.out.print(x+ " ") );
    }
}
