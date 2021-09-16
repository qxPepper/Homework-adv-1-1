class MyThread extends Thread {
    private final int SLEEP_TIME = 2500;

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(SLEEP_TIME);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            err.getMessage();
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
