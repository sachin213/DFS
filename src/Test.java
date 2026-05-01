import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Boolean s = new Boolean(true) ;
        System.out.println("True".equalsIgnoreCase(String.valueOf(s)) ? "Yes" : "No");

        List<String> sl = new ArrayList<>();
        sl.add("ss");
        sl.add("ssl");
        sl.add("ssExempt");
        sl.add("RestrictedStock");
        if(sl.contains("ssExempt")){
            sl.set(sl.indexOf("ssExempt"),"exempt");
        }
        sl.stream().forEach(System.out::println);
    }
}
