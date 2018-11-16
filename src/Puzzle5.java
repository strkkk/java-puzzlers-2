public class Puzzle5 {
}

@ /* my comment */ interface MyAnnotation {
    String value() default "Hello";
}

interface MyInterface extends MyAnnotation { }

class AnnotationPuzzle {
    public static void main(String[] args) {
        var myVar = new MyInterface() {
            @ /*my comment 2*/ Override
            public String value() {
                return "ITSubbotnik";
            }
        };
        System.out.println(myVar.value());
    }
}

//a. Hello
//b. ITSubbotnik
//c. ClassCastException
//d. Не компилируется
