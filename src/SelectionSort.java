public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9, 3, 5, 76, 6, 4, 54, 7, 58, 94, 2};
        //int arr[] = {2,3,4,5,6,7,8,9}; //lets take already sorted array

        /**
         * Unlike bubble sort here will have sorting from beginning and lowest number will come first
         * Unlike bubble sort here we will compare first element with all other element and
         * Will do swapping at only single time as considering first element as lowest and then will compare with other
         * when you do swapping for one time only then you need to keep in mind that what index is replacing with each other
         */
        //int lowest = 0;
        for(int i =0 ;i < arr.length-1 ; i ++){
            int smallest = i;
             boolean swap = false;
            for(int j = i + 1 ; j < arr.length ; j ++){
                 if(arr[smallest] > arr [j]){
                    smallest = j;
                    swap = true;
                }
            }
            if(swap){
                //we have new smalled index here that need to be replaced with ...
                 int temp = arr[i] ;
                arr[i] = arr[smallest];
                arr[smallest] = temp;

            }
        }

       // System.out.println(lowest);
        for(int a :arr){
            System.out.println(a);
        }

    }
}
