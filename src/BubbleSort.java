public class BubbleSort {
    public static void main(String[] args) {
//        int arr[] = {9, 3, 5, 76, 6, 4, 54, 7, 58, 94, 2};
        int arr[] = {2,3,4,5,6,7,8,9}; //lets take already sorted array


        int swappingCount = 0;
        int outerForLoopCount = 0;
        //ideally required iteration is total length - 1 for worst case
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            //to compare element which is next to each other we need to this for loop
            // every iteration will push max number at end, so we can reduce i time iteration after every iteration
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                    swappingCount++;
                }
            }
            outerForLoopCount ++;
            if (!swap) break; // with this , we are saving unnecessary iteration for entry loop , so for sorted array it will iterate only single time
        }
        System.out.println(outerForLoopCount);
        System.out.println(swappingCount);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
