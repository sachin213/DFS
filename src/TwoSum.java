class TwoSum {
    public static void main(String[] args) {
       int[] result =  new TwoSum().twoSum(new int[]{3,2,4},6);
     //   int[] result =  new TwoSum().twoSum(new int[]{2,7,11,15},9);
        //int[] result =  new TwoSum().twoSum(new int[]{3,3},6);
       // int[] result =  new TwoSum().twoSum(new int[]{3,4,5,7,8},6);
        if(result[1] == -1) {
            System.out.println("No result");
        }
        else{
            System.out.println("output index");
            System.out.println(result[0]);
            System.out.println(result[1]);
        }


    }
    public int[] twoSum(int[] nums, int target) {
        int current = 0;
        int secondPointer = -1;
        int[] output = new int[2];
        boolean resultFound = false;
        while(!resultFound && current< nums.length){
            for(int i=0;i<nums.length-1;i++){
                System.out.println("current:"+current + " > i"+i);
                if(current == i) {
                }
               else if(nums[current]+nums[i]==target){
                        secondPointer = i;
                        System.out.println("secondPointer:"+secondPointer);
                        resultFound = true;
                        break;
                }

            }
            if(!resultFound) current++;

        }

        output[0]=current;
        output[1]=secondPointer;
        return output;
    }
}