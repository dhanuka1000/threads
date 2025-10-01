package lk.ijse;

public class Main {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A is running");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B is running");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}