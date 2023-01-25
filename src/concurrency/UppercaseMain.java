package concurrency;

import java.util.concurrent.ForkJoinPool;

public class UppercaseMain {
    public static void main(String[] args) {
        final ForkJoinPool pool = new ForkJoinPool(6);
        pool.invoke(new UppercaseRecursiveAction("abcdefghijklmnopqrstuvwxyz"));
    }
}
