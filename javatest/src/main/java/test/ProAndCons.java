package test;

import java.util.LinkedList;

public class ProAndCons {
    public static void main(String[] args) {
        ProAndCons proAndCons = new ProAndCons();
        MyBQ storage = proAndCons.new MyBQ(15);
        Product product = proAndCons.new Product(storage);
        Consumer consumer = proAndCons.new Consumer(storage);
            new Thread(product).start();
            new Thread(product).start();
            new Thread(consumer).start();
            new Thread(consumer).start();
            new Thread(consumer).start();
            new Thread(consumer).start();

    }
    class Product implements Runnable{
        private MyBQ storage;
        Product(MyBQ storage){
            this.storage=storage;
        }

        @Override
        public void run() {
            int i=0;
            while (true){
                storage.put(i);
                i++;
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumer implements Runnable{
        private MyBQ storage;
        Consumer(MyBQ storage){
            this.storage=storage;
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(storage.take());
            }
        }
    }
    class  MyBQ{
        private int maxSize;
        private LinkedList<Object> storage;
        MyBQ(int maxSize){
            this.maxSize=maxSize;
            storage=new LinkedList<Object>();
        }
        public synchronized void put(Object o){
            while (storage.size()==maxSize){
                try {
                    System.out.println("仓库满了，停止生产");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            storage.add(o);
            notifyAll();
        }
        public synchronized Object take(){
            while (storage.size()==0){
                try {
                    System.out.println("仓库空了，等待生产");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object item= storage.remove();
            notifyAll();
            return item;
        }
    }
}
