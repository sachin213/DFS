import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class Ameduaus {
    public static void main(String[] args) {

        //lamda , string is pelindrom or not
        String str = "XYY";
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = str.toCharArray();
        for(int i = cArray.length-1;i>=0;i-- ){
            stringBuilder.append(cArray[i]);
        }
        boolean isPelindrom = str.equals(stringBuilder.toString()) ? true : false;
        System.out.println("String is pelindrom or not:"+isPelindrom);

        List<Character> characterList = new ArrayList<>();
        Predicate<Character> p  = c -> c.equals('x');

        List<Character> characters = characterList.stream().filter(p).toList();


    }
}
