public class chenZunMing {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Thread a = new Thread(sum);
        a.start();
        for (int i = 0; i <1000000; i++) {
            System.out.print("");
        }
        System.out.println("pong");

    }

    public static class Sum implements Runnable {
        @Override
        public void run() {
            System.out.println("ping");
        }
    }
}
