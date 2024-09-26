public class HelloWorld {
    public static void main(String[] args) {

        Runnable helloWorldRunnable = () -> System.out.println("Hello, World!");

        helloWorldRunnable.run();

        Thread thread = new Thread(helloWorldRunnable);
        thread.start();
    }
}