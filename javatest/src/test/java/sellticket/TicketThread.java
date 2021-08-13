package sellticket;

public class TicketThread implements Runnable {
    private int ticket=100;
    Object obj=new Object();
    @Override
    public void run() {
       while (true){
          synchronized (obj){
              if(ticket>0){
                  System.out.println("当前正在出售第"+ticket+"张票");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  ticket--;
              }
          }
       }

    }
}
