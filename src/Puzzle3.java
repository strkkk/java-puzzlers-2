import java.util.Arrays;
import java.util.List;

public class Puzzle3 {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3, 4);
        try {
            list.remove(0);
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(list.getClass().getSimpleName());
        }
    }
}

//a. UnmodifiableList
//b. ArrayList
//c. ImmutableList
//d. 2, 3, 4
