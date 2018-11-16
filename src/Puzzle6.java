public class Puzzle6 {
    public static void main(String... args) throws Exception {
        Thread.currentThread().destroy();
    }
}

//    a. Нормально завершит работу
//    b. Не скомпилируется
//    c. NoSuchMethodError
//    d. InterruptedException
