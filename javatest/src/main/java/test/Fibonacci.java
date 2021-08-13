package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Fibonacci f = new Fibonacci(20);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> task = forkJoinPool.submit(f);
        System.out.println(task.get());
    }
        private int x;

    public Fibonacci(int x) {
        this.x = x;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Integer compute() {
        if (x<=1){
            return x;
        }
        Fibonacci f1 = new Fibonacci(x - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(x - 2);
        f2.fork();
        return f1.join()+f2.join();
    }
}
