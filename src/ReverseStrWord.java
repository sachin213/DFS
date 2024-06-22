public class ReverseStrWord {
    public static void main(String[] args) {
        String s = "java is a object oriented programming";
        String strArr [] = s.split(" ");
        for(int i = strArr.length-1;i>=0;i--){
            System.out.print(strArr[i]+ " ");
        }
    }
}
