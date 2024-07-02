public class PalindromeString {
    public static void main(String[] args) {
        String str = "XYY";
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = str.toCharArray();
        for(int i = cArray.length-1;i>=0;i-- ){
            stringBuilder.append(cArray[i]);
        }
        boolean isPalindrome = str.equals(stringBuilder.toString()) ? true : false;
        System.out.println("String is Palindrome or not:"+isPalindrome);

    }
}
