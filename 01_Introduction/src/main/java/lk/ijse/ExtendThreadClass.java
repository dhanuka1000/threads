package lk.ijse;

public class ExtendThreadClass {
    public static void main(String[] args) {
        ExtendThread thread = new ExtendThread();
        thread.start();
    }
}
class ExtendThread extends Thread {
    public void run() {
        System.out.println("Extend Thread");
    }
}
