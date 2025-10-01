package lk.ijse;

public class Synchronized {

    public static void main(String[] args) throws InterruptedException {

        Calculation1 calculation = new Calculation1();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        } );

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        });

        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(calculation.num);
    }
}

class Calculation1{
    int num;

    public synchronized void increment(){
        num++;
    }
}
