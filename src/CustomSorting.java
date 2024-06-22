public class CustomSorting {
    public static void main(String[] args) {
        int a[] = {1,5,7,45,65,4,3,6,75,24};

        int i = 0;
        int j = 1;
        int k = 1;

        boolean isSorted = true;
        while(k < a.length){
            if(a[i]> a[j]){
                int temp = a[j];
                a[j]= a[i];
                a[i] = temp;
                isSorted = false;
            }
            i++;
            j++;
            //will reset i and j value on below condition to prevent extra integration as result of every iteration last element will be sorted
            if(i >= a.length - k){
                if(isSorted)
                {
                    System.out.println("already sorted , no iteration required");
                    break;
                }
                //once it reach to last element , start from first, this iteration will happen array length - 1 time ,which we are maintain through K
                //reset all
                i=0;
                j=1;
                k++;
                isSorted = true;

            }
        }

        for(int p : a){
            System.out.print(p+" ");
        }
    }
}
