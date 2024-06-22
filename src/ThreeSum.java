public class ThreeSum {
    public static void main(String[] args) {
        //int [] arr1 = {8,7,6,4}; int outPut = 18;
        int [] arr1 = {8,7,6,4}; int outPut = 19;

        //basic condition : minimum length should be 3 and should be not null
        int i = 0;
        int j = 1;
        int k = 2;
       boolean isResultFound =  false;
        while (k < arr1.length || j<arr1.length-1 || i<arr1.length-2){
            if(arr1[i]+arr1[j]+arr1[k] == outPut){
                System.out.println("Index i:"+ i+" ,j:"+j+" ,k:"+k);
                System.out.println("value i:"+ arr1[i]+" ,j:"+arr1[j]+" ,k:"+arr1[k]);
                isResultFound = true;
                break;
            }
            j++;
            k++;

            if(j >= arr1.length - 1 && j >= arr1.length - 2){
                i++;
                j = i +1;
                k = i+2;
            }

        }
        if(!isResultFound) System.out.println("No match found");
    }
}
