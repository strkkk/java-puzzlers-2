import java.lang.reflect.Modifier;

public class Puzzle7 {
    public static void main(String[] args) {
        int m = int[].class.getModifiers();
        System.out.println(
                "abstract: " + Modifier.isAbstract(m) + ", " +
                        "final:    " + Modifier.isFinal(m)
        );
    }
}

//a. abstract: true, final: true
//b. abstract: false, final: true
//c. abstract: true, final: false
//d. Ошибка в рантайме
