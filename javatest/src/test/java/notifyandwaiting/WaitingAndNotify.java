package notifyandwaiting;
/*
线程之间的通信
    创建 消费者：告知老板需要的包子种类和数量，调用waiting方法等待，放弃cpu执行权
    创建老板：花5秒生产包子。做好后调用notify唤醒顾客吃包子
    注意：
        老板和顾客必须用同步代码块包裹起来
        同步使用锁对象必须是唯一的
        只有锁对象才能调用wait和notify方法
        被唤醒的线程会继续执行 wait后的代码
 */
public class WaitingAndNotify {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(new Runnable() {
            //创建消费者
            @Override
            public void run() {
          while (true){
              //保证等待和 唤醒线程只有一个在执行，使用同步代码 块
              synchronized (obj){
                  System.out.println("告知老板要的包子数量和种类");
                  try {
                      obj.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("开始吃包子");
              }
          }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                        //花5秒做包子
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    synchronized (obj) {
                        System.out.println("包子做好了，唤醒顾客");
                        obj.notify();
                    }
                }
            }
        }).start();
    }


}
