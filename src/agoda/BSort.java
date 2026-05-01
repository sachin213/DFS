package agoda;

public class BSort {

    static void bSort(int[] arr){
        int n = arr.length;
        int i , j;

        for(i = 0; i < n-1;i++){
            boolean swap = false;
            for(j = 0;j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    static void swap(int[] arr, int early, int next){
        int temp = arr[early];
        arr[early] = arr[next];
        arr[next] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,23,5,6};
        bSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
