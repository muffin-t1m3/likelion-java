class IncrementCounter implements Runnable {
    @Override
    public void run() {
        int counter = 1;

        while (counter < 101) {
            System.out.println("Increment: " + counter);
            counter++;
        }
    }
}


class DecrementCounter implements Runnable {
    @Override
    public void run() {
        int counter = 100;

        while (counter > -1) {
            System.out.println("Decrement: " + counter);
            counter--;
        }
    }
}


public class Practice01 {
    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementCounter());
        Thread decrementThread = new Thread(new DecrementCounter());
        incrementThread.start();
        decrementThread.start();
    }
}
