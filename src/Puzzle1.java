import java.util.ArrayList;
import java.util.List;

class Zombie {
    static final List ZOMBIES = new ArrayList<>();

    protected void finalize() {
        ZOMBIES.add(this);
    }

    public static void main(String... args) {
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            ZOMBIES.add(new Zombie());
            if (i % 100 == 0) {
                ZOMBIES.clear();
                System.gc();
            }
        }
    }
}

//a. Все ок
//b. OutOfMemoryError
//c. NullPointerException
//d. Что-то другое
