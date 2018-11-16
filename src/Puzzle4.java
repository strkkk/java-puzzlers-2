import java.util.stream.IntStream;

public class Puzzle4 {
}

class PuzzleLeft {
    static {
        long s = IntStream.range(0, 10000)
                .parallel()
                .map(i -> 1)
                .sum();
        System.out.println(s);
    }

    public static void main(String[] args) {
    }
}

class PuzzleRight {
    static {
        long s = IntStream.range(0, 10000)
                .parallel()
                .map(i -> 1)
                .count();
        System.out.println(s);
    }

    public static void main(String[] args) {
    }
}

//a. 10000 – 10000
//b. Ничего – 10000
//c. 10000 – Ничего
//d. Ничего – Ничего
