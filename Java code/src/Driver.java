public class Driver {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 1; itr < 21; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.print(" " + itr);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 2; itr < 21; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.print(" " + itr);
                    }
                }
            }
        });
        try {
            t2.start();
            t2.join();
            t1.start();
            t1.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }
    }
}