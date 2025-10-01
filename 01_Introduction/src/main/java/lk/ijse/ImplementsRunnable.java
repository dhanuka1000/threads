package lk.ijse;

public class ImplementsRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable");
    }
}
