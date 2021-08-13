package sellticket;

public class MainRun {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}
