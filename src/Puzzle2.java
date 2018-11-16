import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class Puzzle2 {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> System.out.println("1"));
        ForkJoinPool.commonPool().shutdown();    // 1

        CompletableFuture.runAsync(() -> System.out.println("2"));
        ForkJoinPool.commonPool().shutdownNow(); // 2

        CompletableFuture.runAsync(() -> System.out.println("3"));
    }
}

//a. Зависит
//b. Ошибка после // 1
//c. Ошибка после // 2
//d. Завершится нормально
