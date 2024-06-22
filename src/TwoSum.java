class TwoSum {
    public static void main(String[] args) {
      //  int[] arr1 =  {3,2,4};int outPut = 6;
      //  int[] arr1 ={2,7,11,15}; int outPut = 9;
        int[] arr1 = {3,3};int outPut = 6;
     //   int[] arr1 = {3,4,5,7,8}; int outPut = 6;

        int i = 0; //pointer 1
        int j = 1; // pointer 2
        boolean isResultFound = false;

        //basic condition should be minimum size should be 2 for given array and array should not be null

        //iterate till second pointer reach to end of array and
        while (j < arr1.length || i < arr1.length-1)
        {
                 if(outPut == arr1[i] + arr1[j]){
                     System.out.println("value : "+arr1[i] + ", " +arr1[j]);
                     System.out.println("Index : "+i + ", " +j);
                     isResultFound = true;
                     break;
                 }
                 j++; // increment second pointer every time
                 if(j >= arr1.length) { // increment first point once second pointer reach to end , relocate second pointer next to first pointer
                     i++;
                     j = i + 1;
                 }
        }
        if(!isResultFound) System.out.println("No match found");
    }
}