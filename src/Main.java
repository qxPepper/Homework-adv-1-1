public class Main {
    private static final int SLEEP_TIMEOUT = 15000;

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        ThreadGroup subGroup = new ThreadGroup("subGroup");

        final Thread thread1 = new Thread(subGroup, myThread, "поток 1");
        final Thread thread2 = new Thread(subGroup, myThread, "поток 2");
        final Thread thread3 = new Thread(subGroup, myThread, "поток 3");
        final Thread thread4 = new Thread(subGroup, myThread, "поток 4");

        System.out.println("Создаю потоки...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(SLEEP_TIMEOUT);

        subGroup.interrupt();

        System.out.println("Завершаю все потоки.");
    }
}
